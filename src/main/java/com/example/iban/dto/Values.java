
package com.example.iban.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bank_code",
    "branch_code",
    "national_check_digit",
    "account_number",
    "balance_account_number",
    "account_type",
    "iban_check_digits",
    "currency_code",
    "zeroes"
})
@Generated("jsonschema2pojo")
public class Values {

    @JsonProperty("bank_code")
    private BankCode bankCode;
    @JsonProperty("branch_code")
    private BranchCode branchCode;
    @JsonProperty("national_check_digit")
    private NationalCheckDigit nationalCheckDigit;
    @JsonProperty("account_number")
    private AccountNumber accountNumber;
    @JsonProperty("balance_account_number")
    private BalanceAccountNumber balanceAccountNumber;
    @JsonProperty("account_type")
    private AccountType accountType;
    @JsonProperty("iban_check_digits")
    private IbanCheckDigits ibanCheckDigits;
    @JsonProperty("currency_code")
    private CurrencyCode currencyCode;
    @JsonProperty("zeroes")
    private Zeroes zeroes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bank_code")
    public BankCode getBankCode() {
        return bankCode;
    }

    @JsonProperty("bank_code")
    public void setBankCode(BankCode bankCode) {
        this.bankCode = bankCode;
    }

    @JsonProperty("branch_code")
    public BranchCode getBranchCode() {
        return branchCode;
    }

    @JsonProperty("branch_code")
    public void setBranchCode(BranchCode branchCode) {
        this.branchCode = branchCode;
    }

    @JsonProperty("national_check_digit")
    public NationalCheckDigit getNationalCheckDigit() {
        return nationalCheckDigit;
    }

    @JsonProperty("national_check_digit")
    public void setNationalCheckDigit(NationalCheckDigit nationalCheckDigit) {
        this.nationalCheckDigit = nationalCheckDigit;
    }

    @JsonProperty("account_number")
    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("account_number")
    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("balance_account_number")
    public BalanceAccountNumber getBalanceAccountNumber() {
        return balanceAccountNumber;
    }

    @JsonProperty("balance_account_number")
    public void setBalanceAccountNumber(BalanceAccountNumber balanceAccountNumber) {
        this.balanceAccountNumber = balanceAccountNumber;
    }

    @JsonProperty("account_type")
    public AccountType getAccountType() {
        return accountType;
    }

    @JsonProperty("account_type")
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("iban_check_digits")
    public IbanCheckDigits getIbanCheckDigits() {
        return ibanCheckDigits;
    }

    @JsonProperty("iban_check_digits")
    public void setIbanCheckDigits(IbanCheckDigits ibanCheckDigits) {
        this.ibanCheckDigits = ibanCheckDigits;
    }

    @JsonProperty("currency_code")
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currency_code")
    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("zeroes")
    public Zeroes getZeroes() {
        return zeroes;
    }

    @JsonProperty("zeroes")
    public void setZeroes(Zeroes zeroes) {
        this.zeroes = zeroes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
