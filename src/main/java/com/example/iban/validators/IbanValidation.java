package com.example.iban.validators;

import java.math.BigInteger;

public class IbanValidation {

	private static final int LETTER_OFFSET = -55;
	private static final int MOD_97 = 97;

	public static boolean checkIbanLength(String ibanString, int length) {

		ibanString = ibanString.replace(" ", "");
		boolean isValid = (ibanString.length() == length) ? true : false;

		return isValid;
	}

	public static boolean checkIbanValidation(String ibanString) {

		String ibanStringConvertedToDigits = convertCharactersToDigits(ibanString);
		ibanStringConvertedToDigits = ibanStringConvertedToDigits.replace(" ", "");
		
		BigInteger integerValue = new BigInteger(ibanStringConvertedToDigits);

		boolean valid = integerValue.mod(new BigInteger("97")).intValue() == 1;

		return valid;

	}

	public static boolean checkIbanModuloValidation(String ibanString)	{

		String ibanStringConvertedToDigits = convertCharactersToDigits(ibanString);

		//1. Starting from the leftmost digit of ibanStringConvertedToDigits, construct a number using the 
		//first 9 digits and call it number
		//2. Calculate number mod 97.
		String number = ibanStringConvertedToDigits.substring(0, 9);
		String remaining = ibanStringConvertedToDigits.replace(number, "");

		number = String.valueOf(calculateModulus(number));

		//3. Construct a new 9-digit number by concatenating the above result (step 2) 
		//with the next 7 digits of D. If there are fewer than 7 digits remaining in D 
		//but at least one, then construct a new N, which will have less than 9 digits, 
		//from the above result (step 2) followed by the remaining digits of D
		//4. Repeat steps 2–3 until all the digits of D have been processed
		while (remaining.length() > 7) {
			number = number + remaining.substring(0, 7);
			remaining = remaining.substring(7);
			number = String.valueOf(calculateModulus(number));
		}

		//5. The result of the final calculation in step 2 will be D mod 97 = N mod 97.
		number = number + remaining;
		int validation = calculateModulus(number);

		boolean isValid = (validation == 1) ? true : false;

		return isValid;
		
	}
	
	private static int calculateModulus(String number)	{
		
		int answer = Integer.parseInt(number) % MOD_97;
		
		return answer;
	}

	private static String convertCharactersToDigits(String ibanString) {

		ibanString = ibanString.replace(" ", "");
		ibanString = ibanString.substring(4) + ibanString.substring(0, 4);
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ibanString.length(); i++) {
			char character = ibanString.charAt(i);
			if (Character.isDigit(character)) {
				sb.append(character);
			} else { 
				//Replace each letter in the string with two digits, thereby expanding the string, where A = 10, B = 11, ..., Z = 35
				// A in ascii = 65 so we have to subtract by 55 
				int intValue = (int) Character.toUpperCase(character) + LETTER_OFFSET;
				sb.append(intValue);
			}
		}

		return sb.toString();
	}

}
