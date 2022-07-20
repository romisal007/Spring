package com.rohit.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/map/mapconfig.xml");
		 Customer cust =   (Customer) ctx.getBean("customer");
		 System.out.println(cust);

	}

}
