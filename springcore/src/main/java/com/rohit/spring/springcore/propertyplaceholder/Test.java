package com.rohit.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/rohit/spring/springcore/propertyplaceholder/config.xml");
		
		MyDAO dao= (MyDAO) ctx.getBean("mydao");
		System.out.println(dao);
	}

}
