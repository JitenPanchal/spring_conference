package com.pluralsight.conference.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || value.length() == 0) {
			return true;
		}

		if (value.length() > 10 || value.length() < 2) {
			return false;
		}

		// TODO Auto-generated method stub
		return true;
	}

}