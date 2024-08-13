package com.ruhi.springboot.demo.springtraining.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// expose new rest api that return "Hello World"

	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
}
