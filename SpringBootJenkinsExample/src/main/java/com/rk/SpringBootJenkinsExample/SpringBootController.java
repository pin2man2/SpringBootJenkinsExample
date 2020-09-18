package com.rk.SpringBootJenkinsExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@GetMapping("/home")
	public String welcome() {
		
		return "Welcome to the Devops World!!";
	}

}
