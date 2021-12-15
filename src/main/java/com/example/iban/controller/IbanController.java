package com.example.iban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.iban.model.Iban;
import com.example.iban.service.IbanValidationServiceImpl;

@RestController
@RequestMapping("")
public class IbanController {

	@Autowired
	IbanValidationServiceImpl ibanService;
	
	/**
	 * Returns the response regarding posted IBAN number is valid or not.
	 * 
	 * @param ibannumber	
	 *            we need an ibannumber in order to have something to validate
	 * @return the JSON response for posted IBAN number with information if it is valid or not.
	 */
	@RequestMapping(value = "/iban", method = RequestMethod.GET)
	@ResponseBody
	public Iban isValidIban(@RequestParam(name = "ibannumber") String ibanString)	{
		
		Iban ibanJsonObejct = ibanService.getIbanValidation(ibanString);
		
		return ibanJsonObejct;
		
	}	
}
