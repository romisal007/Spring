package com.rohit.spring.springadvance.springorm.passanger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.spring.springadvance.springorm.passanger.dao.PassangerDao;
import com.rohit.spring.springadvance.springorm.passanger.dto.Passanger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rohit/spring/springadvance/springorm/passanger/test/config.xml");

		PassangerDao dao = (PassangerDao) ctx.getBean("passangerDao");
		Passanger pass = new Passanger();
		pass.setId(4);
		pass.setFirstName("Swati");
		pass.setLastName("Misal");

		
		/*
		 * int result= dao.create(pass);
		 * System.out.println("no of passanger created "+result );
		 */
		
		/*
		 * dao.update(pass); System.out.println("no of passanger updated " );
		 */
		
		/*
		 * dao.delete(pass); System.out.println("no of passanger deleted " );
		 */
		
		  int id=1;
		  Passanger pass2=dao.read(id);
		  System.out.println("passanget details of id "+id+ " is " +pass2 );
		 
			/*
			 * List<Passanger> pass3 = dao.readList(); System.out.println("passanger List "
			 * + pass3);
			 */
	}

}
