package com.love2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new field for email-addr and team
	private String emailAddress;
	private String team;
	
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach:-inside setter meth -setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach:-inside setter meth -setTeam");
		this.team = team;
	}

	
	
	
	//create no-arg constructor
	public CricketCoach() {
		
		System.out.println("CricketCoach:-inside No arg constructor");
	}
	
	// setter meth in ur class for injection
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("CricketCoach:-inside setter meth -setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return " make fast  bolling practice 15 min a day";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
