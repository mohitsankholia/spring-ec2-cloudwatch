package com.mohitsankholia.SpringSecurity.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	private static final Logger LOGGER = LogManager.getLogger(SpringController.class);

	@GetMapping("/")
	private String home() {
		
		LOGGER.info("home url hitted");

		return ("<h1>welcome to new home</h1>");
	}

	@GetMapping("/user/one")
	private String userOne() {
		
		LOGGER.info("user one url hitted");

		return ("<h1>welcome to User One</h1>");
	}

	@GetMapping("/user/two")
	private String userTwo() {
		
		LOGGER.info("user two url hitted");

		return ("<h1>welcome to user two</h1>");
	}

	@GetMapping("/admin/one")
	private String adminOne() {
		
		LOGGER.info("admin one url hitted");

		return ("<h1>welcome to admin one</h1>");
	}

	@GetMapping("/admin/two")
	private String adminTwo() {
		
		LOGGER.info("admin two url hitted");

		return ("<h1>welcome to admin two</h1>");
	}
}
