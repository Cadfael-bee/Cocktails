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
	
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public long getCount() {
		return userRepository.count();
	}

}
