package com.rohit.spring.springmvcorm.user.services;

import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rohit.spring.springmvcorm.user.dao.UserDao;
import com.rohit.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;

	@Override
	@Transactional
	public int save(User user) {
		//bussiness logic
		return dao.create(user);
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public List<User> getUser() {
		List<User> users=dao.findUser();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findUser(id);
	}



}
