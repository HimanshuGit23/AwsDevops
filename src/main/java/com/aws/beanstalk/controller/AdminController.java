package com.aws.beanstalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Welcome to Admin Controller";
	}
	
	@PostMapping("/save/{id}")
	public String saveAdmin(@PathVariable String id){
		return "Admin saved....";
		
	}

}
