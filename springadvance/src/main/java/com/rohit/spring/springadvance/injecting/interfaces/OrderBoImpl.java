package com.rohit.spring.springadvance.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBO {

	@Autowired
	@Qualifier("dao")
	private OrdeDAO dao;

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Insede orderbo");
		dao.createOrder();
	}

	public OrdeDAO getDao() {
		return dao;
	}

	public void setDao(OrdeDAO dao) {
		this.dao = dao;
	}

}
