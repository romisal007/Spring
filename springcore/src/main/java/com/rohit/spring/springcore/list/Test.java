package com.rohit.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/list/listconfig.xml");
		 Hospital hospital =   (Hospital) ctx.getBean("hospital");
		 System.out.println("hospital Name: "+hospital.getName());
		 System.out.println("Hospital departments: "+ hospital.getDepartments());
		 
		 System.out.print( hospital.getDepartments().getClass()+" ");
		 System.out.println( hospital.getDepartments());


	}

}
