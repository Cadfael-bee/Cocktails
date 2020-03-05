package com.my.store.service;

import com.my.store.model.User;

public interface UserService {
	
	User save(User user);

	User get(String id) throws Exception;

}
