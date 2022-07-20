package com.rohit.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/dependencycheck/config.xml");
		 Prescription cd =  (Prescription) ctx.getBean("prescription");
		 System.out.println(cd);
		 
		 
	}

}
  