package com.rohit.spring.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
		Service service = ctx.getBean(Service.class);
		System.out.println(service.hashCode());
		service.save();
		Service service2 = ctx.getBean(Service.class);
		service2.save();
		System.out.println(service2.hashCode());
		ctx.close();
	}

}
