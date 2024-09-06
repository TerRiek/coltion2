package com.coltion.coltion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/api/test")
	public String hello() {
		
		
		return "Hello World";
	}
}
