package com.rohit.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/reftypes/refconfig.xml");
		 Student cust =   (Student) ctx.getBean("student");
		 System.out.println(cust);

	}

}
