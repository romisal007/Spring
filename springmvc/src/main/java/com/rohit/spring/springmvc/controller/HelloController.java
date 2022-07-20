package com.rohit.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name","Rohit");
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
