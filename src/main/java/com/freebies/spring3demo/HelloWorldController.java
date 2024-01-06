package com.freebies.spring3demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String getValue() {
		return "Welcome to spring boot 3";
	}

}
