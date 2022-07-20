package com.rohit.spring.springadvance.assigment.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/rohit/spring/springadvance/assigment/autowiring/config.xml");
		
		Customer cust=(Customer) ctx.getBean("customer");
		System.out.println(cust);
	}

}
