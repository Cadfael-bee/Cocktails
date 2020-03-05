package com.my.store.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.store.model.User;
import com.my.store.service.UserService;
import com.my.store.service.ValidationService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource(name="userServiceImpl")
	private UserService userservice;
	
	@Resource(name="validationServiceImpl")
	private ValidationService validationService;
	
	@PostMapping
	public String createUser(@RequestParam String userName,
								@RequestParam String fName,
								@RequestParam String lName,
								@RequestParam String email,
								@RequestParam String password,
								@RequestParam String confirmPassword,
								@RequestParam boolean news) {
		System.out.println(new User((int)userservice.getCount(), userName, fName, lName, email, password, news));
		
		return "login";
	}

}
