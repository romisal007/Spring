package com.rohit.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/rohit/spring/springcore/set/setconfig.xml");
		 CarDealer cd =   (CarDealer) ctx.getBean("carDealer");
		 System.out.println("Car Name: "+cd.getName());
		 System.out.println("Car Models: "+ cd.getModels());
		 System.out.println( cd.getModels().getClass());


	}

}
