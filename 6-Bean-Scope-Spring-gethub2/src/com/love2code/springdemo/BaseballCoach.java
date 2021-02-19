package com.love2code.springdemo;

public class BaseballCoach implements Coach {

	//def private field for dependency
	private FortuneService fortuneService;
	
	
	//def constractor for dependency injuction
	public BaseballCoach(FortuneService  theFortuneService) {
		fortuneService=theFortuneService;
		
	}
	
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
		
		
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get a fortune
		
		
		return fortuneService.getFortune();
	}
	
	
}
