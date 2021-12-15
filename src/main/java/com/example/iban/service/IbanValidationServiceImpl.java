package com.example.iban.service;

import org.springframework.stereotype.Service;

import com.example.iban.dto.Ibanformat;
import com.example.iban.model.Iban;
import com.example.iban.model.Validations;
import com.example.iban.validators.IbanCountryDetails;
import com.example.iban.validators.IbanValidation;

/**
 * 
 * @author gustav
 *
 */
@Service
public class IbanValidationServiceImpl implements IbanValidationService {

	public Iban getIbanValidation(String ibanString) {

		boolean isIbanValid = false;
		boolean isModuloValid = false;
		boolean isValidLength = false;
		boolean isCountrySupportedIban = false;
		
		Ibanformat ibanData = IbanCountryDetails.getIbanCountryDetails(ibanString);

		//If object is empty then we do not have an country that supports IBAN.
		if (ibanData != null) {

			isCountrySupportedIban = true;
			
			//Check that the posted IBAN number has correct length for specific country.
			isValidLength = IbanValidation.checkIbanLength(ibanString, ibanData.getLength());

			if (isValidLength) {

				//Validating posted IBAN number against two algorithms from:
				//https://en.wikipedia.org/wiki/International_Bank_Account_Number
				isIbanValid = IbanValidation.checkIbanValidation(ibanString);
				isModuloValid = IbanValidation.checkIbanModuloValidation(ibanString);
			}
		} 

		Iban ibanResponse = new Iban();
		ibanResponse.setCountry((ibanData != null) ? ibanData.getCountry() : null);
		ibanResponse.setIban(ibanString);
		ibanResponse.setValid(isIbanValid && isModuloValid && isValidLength && isCountrySupportedIban);
		Validations validations = new Validations();
		validations.setIbanValid(isIbanValid);
		validations.setModuloValid(isModuloValid);
		validations.setValidLength(isValidLength);
		validations.setCountrySupportedIban(isCountrySupportedIban);
		ibanResponse.setValidations(validations);

		return ibanResponse;
	}

}