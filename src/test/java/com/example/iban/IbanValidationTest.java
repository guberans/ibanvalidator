package com.example.iban;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.iban.dto.Ibanformat;
import com.example.iban.service.IbanValidationServiceImpl;
import com.example.iban.validators.IbanCountryDetails;
import com.example.iban.validators.IbanValidation;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class IbanValidationTest {

	@Autowired
	IbanValidationServiceImpl ibanService;
	
	@Test
	public void validIbanTest() {
		
		String ibanString = "GB82 WEST 1234 5698 7654 32";
		
		boolean checkLength = IbanValidation.checkIbanLength(ibanString, 22);
		boolean isValid = IbanValidation.checkIbanValidation(ibanString);
		boolean isModolusValid = IbanValidation.checkIbanModuloValidation(ibanString);
		Ibanformat ibanCountryData = IbanCountryDetails.getIbanCountryDetails(ibanString);
		
		Assert.assertEquals(true, checkLength);
		Assert.assertEquals(true, isValid);
		Assert.assertEquals(true, isModolusValid);
		Assert.assertTrue(ibanCountryData != null);
		
	}

	@Test
	public void invalidIbanTest() {
		
		String ibanString = "GB82 WEST 1234 5698 7654 323";

		boolean checkLength = IbanValidation.checkIbanLength(ibanString, 22);
		boolean isValid = IbanValidation.checkIbanValidation(ibanString);
		boolean isModolusValid = IbanValidation.checkIbanModuloValidation(ibanString);

		Assert.assertEquals(false, checkLength);
		Assert.assertEquals(false, isValid);
		Assert.assertEquals(false, isModolusValid);
				
	}


	@Test
	public void invalidIbanTest2() {
		
		String ibanString = "GB82 WEST 1234 5698 7654 33";

		boolean checkLength = IbanValidation.checkIbanLength(ibanString, 22);
		boolean isValid = IbanValidation.checkIbanValidation(ibanString);
		boolean isModolusValid = IbanValidation.checkIbanModuloValidation(ibanString);

		Assert.assertEquals(true, checkLength);
		Assert.assertEquals(false, isValid);
		Assert.assertEquals(false, isModolusValid);
				
	}
	
	@Test
	public void noCountryFormatedIban() {
		
		String ibanString = "PP82 WEST 1234 5698 7654 33";

		boolean checkLength = IbanValidation.checkIbanLength(ibanString, 22);
		boolean isValid = IbanValidation.checkIbanValidation(ibanString);
		boolean isModolusValid = IbanValidation.checkIbanModuloValidation(ibanString);
		Ibanformat ibanCountryData = IbanCountryDetails.getIbanCountryDetails(ibanString);

		Assert.assertEquals(true, checkLength);
		Assert.assertEquals(false, isValid);
		Assert.assertEquals(false, isModolusValid);
		Assert.assertTrue(ibanCountryData == null);
				
	}
	
	
}
