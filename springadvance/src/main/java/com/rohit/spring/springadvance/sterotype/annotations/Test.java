package com.rohit.spring.springadvance.sterotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/rohit/spring/springadvance/sterotype/annotations/config.xml");
		Instructor inst=(Instructor) context.getBean("inst");
		System.out.println(inst);
		System.out.println(inst.hashCode());
		
		Instructor inst2=(Instructor) context.getBean("inst");
		System.out.println(inst2);
		System.out.println(inst2.hashCode());
		
		
	}

}
