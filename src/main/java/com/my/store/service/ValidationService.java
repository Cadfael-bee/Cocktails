package com.my.store.service;

public interface ValidationService {
	
	boolean validateUserName(String userName);

	boolean validateFName(String fName);

	boolean validateLName(String lName);

	boolean validatePassword(String password);

	boolean validateConfirmPassword(String password, String confirmPassword);

	boolean validateEmail(String email);

}
