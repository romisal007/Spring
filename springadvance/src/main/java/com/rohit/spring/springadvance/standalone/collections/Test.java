package com.rohit.spring.springadvance.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/rohit/spring/springadvance/standalone/collections/config.xml");
		ProductsList emp=(ProductsList) context.getBean("productList");
		System.out.println(emp);
		
		
	}

}
