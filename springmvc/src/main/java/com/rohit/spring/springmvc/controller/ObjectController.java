package com.rohit.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("displayObject");
		 Employee emp =new Employee();
		 emp.setId(1230);
		 emp.setName("Rohit");
		 emp.setSalary("45000");
		modelAndView.addObject("employee",emp);
		return modelAndView;
	}
}
