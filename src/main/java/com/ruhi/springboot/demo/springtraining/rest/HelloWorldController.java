package com.ruhi.springboot.demo.springtraining.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// expose new rest api that return "Hello World"
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@Value("${coach.name}")
	private String coachName;
	
	@Value("${coach.time}")
	private String coachTime;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/goodbye")
	public String sayGoodBye() {
		return "Good Bye now!";
	}
	
	@GetMapping("/coachdetails")
	public String getCoachNamenTime() {
		logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        
		return coachName+" ia available on "+coachTime;
	}
}
