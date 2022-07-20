package com.rohit.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/properties/propconfig.xml");
		 CountriesAndLanguages cust =   (CountriesAndLanguages) ctx.getBean("countriesAndlanguages");
		 System.out.println(cust);

	}

}
