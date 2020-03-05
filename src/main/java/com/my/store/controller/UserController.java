package com.my.store.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.store.model.User;
import com.my.store.model.request.UserRequest;
import com.my.store.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Resource(name="userServiceImpl")
	private UserService userservice;
	
	@PostMapping("/create")
	public User createUser(@RequestBody UserRequest userRequest) {
		User user = new User();
		user.setUserName(userRequest.getUserName());
		user.setPassword(userRequest.getPassword());
		return userservice.save(user);
	}
	
	@GetMapping("/get/{id}")
	public User getUserById(@PathVariable String id) {
		try {
			return userservice.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
