package com.example.mongosetup.Conretoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/")
	public String hi() {
		
		return "register / login page will be here";
	}
}
