package com.mohitsankholia.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	
	@GetMapping("/")
	private String home() {
		
		return ("<h1>welcome to home</h1>");
	}
	
	@GetMapping("/user/one")
	private String userOne() {
		
		return ("<h1>welcome to User One</h1>");
	}
	
	@GetMapping("/user/two")
	private String userTwo() {
		
		return ("<h1>welcome to user two</h1>");
	}
	
	@GetMapping("/admin/one")
	private String adminOne() {
		
		return ("<h1>welcome to admin one</h1>");
	}
	
	@GetMapping("/admin/two")
	private String adminTwo() {
		
		return ("<h1>welcome to admin two</h1>");
	}
}
