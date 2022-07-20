package com.rohit.spring.springcore.assigment.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/assigment/properties/propconfig.xml");
		 MyDao dao =   (MyDao) ctx.getBean("mydao");
		 System.out.println(dao);

	}

}
