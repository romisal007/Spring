package com.rohit.spring.springmvcorm.user.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.rohit.spring.springmvcorm.user.entity.*;
import com.rohit.spring.springmvcorm.user.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);

		return result;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<User> findUser() {

		List<User> loadAll = hibernateTemplate.loadAll(User.class);
		return loadAll;
	}

	@Override
	public User findUser(int id) {
		return hibernateTemplate.get(User.class, id);

	}

}
