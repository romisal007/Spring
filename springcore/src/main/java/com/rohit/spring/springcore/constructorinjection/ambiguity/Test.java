package com.rohit.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/rohit/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition emp=(Addition) context.getBean("addition");
		System.out.println(emp);
		
		
	}

}
