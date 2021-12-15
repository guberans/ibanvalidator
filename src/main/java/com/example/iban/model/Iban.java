package com.example.iban.model;

import java.io.Serializable;

public class Iban implements Serializable {

	private String country;
	private String iban;
	private boolean valid;
	private Validations validations;
		
	private final static long serialVersionUID = 8439801062403074807L;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public Validations getValidations() {
		return validations;
	}

	public void setValidations(Validations validations) {
		this.validations = validations;
	}
}
