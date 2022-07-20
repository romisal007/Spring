package com.rohit.spring.springadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImple implements OrdeDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside corder dao createordeer()");
	}

}
