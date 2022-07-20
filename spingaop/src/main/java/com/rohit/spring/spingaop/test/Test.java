package com.rohit.spring.spingaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.spring.spingaop.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/rohit/spring/spingaop/test/config.xml");
		ProductService pservice = (ProductService) ctx.getBean("productservice");
		System.out.println(pservice.multiply(4, 5));
	}

}
