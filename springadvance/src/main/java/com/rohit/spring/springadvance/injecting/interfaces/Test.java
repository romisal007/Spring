package com.rohit.spring.springadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/rohit/spring/springadvance/injecting/interfaces/config.xml");
		OrderBO bo=(OrderBO) context.getBean("bo");
		bo.placeOrder(); 
		
		
		
		
	}

}
