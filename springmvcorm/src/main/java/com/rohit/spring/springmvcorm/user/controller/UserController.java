package com.rohit.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rohit.spring.springmvcorm.user.entity.User;
import com.rohit.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	
	@RequestMapping("registrationPage")
	public String showRegistrationPage2() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result","User created with Id"+ result);
		return "userReg";
	}

	@RequestMapping("getusers")
	public String loadusers(ModelMap model) {
		List<User> userlist = service.getUser();
		model. addAttribute("users",userlist);
		return "displayUsers";
	}
	
	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		User userById = service.getUserById(id);
		String msg="";
		if(userById!=null) {
			msg= id+ " user Already exists";
		}
		return msg;
	}
	
	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
