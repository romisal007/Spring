package com.rohit.spring.springmvcorm.user.services;

import java.util.List;

import com.rohit.spring.springmvcorm.user.entity.User;

public interface UserService {

	int save(User user);
	List<User> getUser();
	User getUserById(Integer id);	
}
