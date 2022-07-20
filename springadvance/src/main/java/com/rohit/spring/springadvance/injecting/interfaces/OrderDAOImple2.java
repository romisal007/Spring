package com.rohit.spring.springadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImple2 implements OrdeDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside order dao impli2 createorder()");
	}

}
