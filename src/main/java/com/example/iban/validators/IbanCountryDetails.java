package com.example.iban.validators;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.example.iban.dto.Iban;
import com.example.iban.dto.Ibanformat;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class IbanCountryDetails {

	public static Ibanformat getIbanCountryDetails(String ibanString) {
		
		String ibanCountryCode = ibanString.substring(0,2);
		
		Iban ibanList = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			ibanList = objectMapper.readValue(new File("src/main/java/com/example/iban/service/iban.json"),
					Iban.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Ibanformat iban : ibanList.getIbanformats()) {

			if (iban.getCountryCode().equals(ibanCountryCode)) {

				return iban;
				
			}
		}
		return null;
		
	}
}
