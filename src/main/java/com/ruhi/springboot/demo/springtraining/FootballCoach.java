package com.ruhi.springboot.demo.springtraining;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "For Football Game, we need 11 players to play.";
	}
}
