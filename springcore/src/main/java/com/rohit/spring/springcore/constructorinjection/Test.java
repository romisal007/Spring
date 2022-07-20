package com.rohit.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/rohit/spring/springcore/constructorinjection/config.xml");
		Employee emp=(Employee) context.getBean("employee-modern");
		System.out.println("Using schema style "+emp);
		
		
		Employee emp2=(Employee) context.getBean("employee");
		
		System.out.println("Regular :"+emp2);
	}

}
