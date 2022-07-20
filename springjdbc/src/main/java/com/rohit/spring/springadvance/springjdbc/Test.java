package com.rohit.spring.springadvance.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/rohit/spring/springadvance/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql="insert into employee values(?,?,?)";
		int result=jdbcTemplate.update(sql,new Integer(1),"Rohit","Misal");
		
		System.out.println("NO of record inserted are "+result);	
	}

}
