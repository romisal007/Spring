package com.rohit.spring.springcore.assigment.dcAndScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/assigment/dcAndScope/config.xml");
		 University uni =   (University) ctx.getBean("university");
		 System.out.println(uni);
		 
		 System.out.println(uni.hashCode());
		 University uni2 =   (University) ctx.getBean("university");
		 System.out.println(uni2.hashCode());

		 

	}

}
