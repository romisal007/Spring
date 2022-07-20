package com.rohit.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohit/spring/springcore/innerbeans/config.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println(employee1.hashCode());
		
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(employee2.hashCode());

	}

}
