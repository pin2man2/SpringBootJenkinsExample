package com.rk.SpringBootJenkinsExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringBootController {
	
	@GetMapping("/home")
	public String welcome() {
		return "Welcome to the Devops World!!";
	}

}
