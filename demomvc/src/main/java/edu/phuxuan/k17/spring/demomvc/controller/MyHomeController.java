package edu.phuxuan.k17.spring.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.phuxuan.k17.spring.demomvc.model.User;

@Controller
public class MyHomeController {
	@RequestMapping("/home")
	public String home( ) {
		return "home";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		User user = new User();
		user.setFullName("HELLOWORLD");
		model.addAttribute("myuser", user);
		return "hello";
	}
}