package com.love2code.springdemo;

public class A3TrackCoach implements Coach {
	// def private field for dependency
	private FortuneService fortuneService;

	public A3TrackCoach() {

	}

	// def constractor for dependency injuction
	public A3TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;

	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return "just do it :-" + fortuneService.getFortune();
	}

	
	
	//add an init method
	public void doMyStartedStuff() {
		System.out.println("Trackcoach:- inside meth-doMyStartedStuff");
	}
	
	//add a destroy meth
	public void doMyCleanupStuff() {
		System.out.println("Trackcoach:- inside meth-doMyCleanupStuff");
	}
	
	
	
	
	
	
	
	
	
}
