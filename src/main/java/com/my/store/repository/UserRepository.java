package com.my.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.store.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	
//	Optional<User> findById(String userId);

}
