package com.rohit.spring.springmvc.controller;

import java.sql.Array;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Rohit");
		emp.setSalary("45000");
		Employee emp2 = new Employee();
		emp2.setId(200);
		emp2.setName("Balu");
		emp2.setSalary("50000");
		Employee emp3 = new Employee();
		emp3.setId(100);
		emp3.setName("Aarti");
		emp3.setSalary("6000");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		empList.add(emp2);
		empList.add(emp3);

		modelAndView.addObject("employees", empList);

		return modelAndView;

	}
}
