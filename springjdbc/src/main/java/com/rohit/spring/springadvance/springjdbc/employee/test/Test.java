package com.rohit.spring.springadvance.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.spring.springadvance.springjdbc.employee.dto.Employee;
import com.rohit.spring.springadvance.springjdbc.employee.dto.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/rohit/spring/springadvance/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
		/*
		 * Employee employee = new Employee(); employee.setId(1);
		 * employee.setFirstName("Rohit"); employee.setLastName("Misal");
		 */
		//int result = dao.create(employee);
		//int result=dao.update(employee);
		//int result=dao.delete(1);
	//	System.out.println(" no of recors inserted are " + result);

		//System.out.println(" no of recors updated are " + result);
		//System.out.println(" no of recors deleted are " + result);
		//Employee employee2 = dao.read(2);
		//		System.out.println("employee record  " +employee2);

		List<Employee> employeelist = dao.reaDList();
		
		System.out.println("employee record  " +employeelist);
		
	}

}
