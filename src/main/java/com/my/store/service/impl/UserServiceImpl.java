package com.my.store.service.impl;

import org.springframework.stereotype.Service;

import com.my.store.model.User;
import com.my.store.repository.UserRepository;
import com.my.store.service.UserService;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User get(String id) throws Exception {
		return userRepository.findById(Long.valueOf(id)).orElseThrow(() -> new Exception("No user"));
	}

}
