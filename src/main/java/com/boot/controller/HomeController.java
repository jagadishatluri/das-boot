package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
 * Testing WebApplication
 */
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "Spring Boot, reporting for duty";
	}

}
