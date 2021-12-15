package com.example.iban.service;

import com.example.iban.model.Iban;

public interface IbanValidationService {

	Iban getIbanValidation(String ibanNumber);

}
