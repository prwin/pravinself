package com.love2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "today is your Lucky Day $";
	}

}
