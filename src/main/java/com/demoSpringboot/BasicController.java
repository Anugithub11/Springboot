package com.demoSpringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	@GetMapping("/message")
	public String print() {
		return "Welcome to amdocs";
	}
	

}
