package com.ruhi.springboot.demo.springtraining.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruhi.springboot.demo.springtraining.Coach;

@RestController
public class DemoController {
	
	private Coach mycoach;
	
	@Autowired
	public DemoController (@Qualifier("cricketCoach") Coach theCoach) {
		this.mycoach = theCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return mycoach.getDailyWorkout();
	}
}
