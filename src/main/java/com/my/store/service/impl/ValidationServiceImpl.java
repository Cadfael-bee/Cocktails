package com.my.store.service.impl;

import org.springframework.stereotype.Service;

import com.my.store.service.ValidationService;

@Service
public class ValidationServiceImpl implements ValidationService {

	@Override
	public boolean validateUserName(String userName) {
		return userName.length() > 2;
	}

	@Override
	public boolean validateFName(String fName) {
		return fName.length() > 3;
	}

	@Override
	public boolean validateLName(String lName) {
		return lName.length() > 3;
	}

	@Override
	public boolean validatePassword(String password) {
		String passwordRegExp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,}$";
		return password.matches(passwordRegExp);
	}
	
	@Override
	public boolean validateConfirmPassword(String password, String confirmPassword) {
		return password.equals(confirmPassword);
	}

	@Override
	public boolean validateEmail(String email) {
		String emailRegExp = "\\S+@\\S+\\.\\S+";
		return email.matches(emailRegExp);
	}
}
