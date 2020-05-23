package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoginService;

@Controller
public class HelloController {
	
@Autowired
private LoginService loginService;
	
	@GetMapping("/")
	   public String index() {
	      return "index";
	   }
	
	   @PostMapping("/hello")
	   public String sayHello(@RequestParam("name") String name, Model model) {
//		   System.out.println(loginService.getAllUser());
	      model.addAttribute("name", name);
	      return "hello";
	   }
	   
	   @PostMapping("/login")
	   public String validateLogin(@RequestParam(value = "un", required = false) String userName,
			   @RequestParam(value = "pw", required = false) String passWord, Model model) {
		   
		   	System.out.println(loginService.getAllUser()); 
		      model.addAttribute("name", userName);
		      return "hello";
		   
	   }
}