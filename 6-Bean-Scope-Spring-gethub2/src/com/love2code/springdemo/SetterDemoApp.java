package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring conf file
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");

		//retrive bean from spring container
	CricketCoach theCoach=	context.getBean("myCricketCoach",CricketCoach.class);
	
		//call meth on bean
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());	
	
	
	//call our new meth to get literal values
	System.out.println(theCoach.getEmailAddress());
	System.out.println(theCoach.getTeam());

	
	//close the context
	context.close();
	
	}

}
