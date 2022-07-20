package com.rohit.spring.springadvance.springjdbc.passanger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.spring.springadvance.springjdbc.employee.dto.Employee;
import com.rohit.spring.springadvance.springjdbc.employee.dto.EmployeeDao;
import com.rohit.spring.springadvance.springjdbc.passanger.dao.PassangerDao;
import com.rohit.spring.springadvance.springjdbc.passanger.dto.Passanger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/rohit/spring/springadvance/springjdbc/passanger/test/config.xml");
		
		PassangerDao dao=(PassangerDao)	ctx.getBean("productDao");
		Passanger pass= new Passanger();
		pass.setId(3);
		pass.setFirstName("asda");
		pass.setLastName("Misal");
		
		/*
		 * int result= dao.create(pass);
		 * System.out.println("no of passanger created "+result );
		 */
		/*
		 * int result=dao.update(pass);
		 * System.out.println("no of passanger updated "+result );
		 */
		/*
		 * int result=dao.delete(new Integer(3));
		 * System.out.println("no of passanger deleted "+result );
		 */
		/*
		 * int id=1; Passanger pass2=dao.read(id);
		 * System.out.println("passanget details of id "+id+ " is " +pass2 );
		 */
		List<Passanger> pass3=dao.readList();
		System.out.println("passanger List "+pass3);
		
	}

}
