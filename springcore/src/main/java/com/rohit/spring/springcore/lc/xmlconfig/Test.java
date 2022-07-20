package com.rohit.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		AbstractApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/lc/xmlconfig/config.xml");
		 Patient cd =   (Patient) ctx.getBean("patient");
		 System.out.println(cd);
		 ctx.registerShutdownHook();
	}

}
 