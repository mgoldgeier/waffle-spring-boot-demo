package com.example;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping
	public String test(Authentication auth) {
		return String.format("You are logged in as: %s", auth.getPrincipal());
	}
	
}
