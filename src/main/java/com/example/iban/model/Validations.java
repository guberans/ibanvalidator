package com.example.iban.model;

public class Validations {

	private boolean isIbanValid;
	private boolean isModuloValid;
	private boolean isValidLength;
	private boolean isCountrySupportedIban;

	public boolean isIbanValid() {
		return isIbanValid;
	}
	public void setIbanValid(boolean isIbanValid) {
		this.isIbanValid = isIbanValid;
	}
	public boolean isModuloValid() {
		return isModuloValid;
	}
	public void setModuloValid(boolean isModuloValid) {
		this.isModuloValid = isModuloValid;
	}
	public boolean isValidLength() {
		return isValidLength;
	}
	public void setValidLength(boolean isValidLength) {
		this.isValidLength = isValidLength;
	}
	public boolean isCountrySupportedIban() {
		return isCountrySupportedIban;
	}
	public void setCountrySupportedIban(boolean isCountrySupportedIban) {
		this.isCountrySupportedIban = isCountrySupportedIban;
	}
	

}
