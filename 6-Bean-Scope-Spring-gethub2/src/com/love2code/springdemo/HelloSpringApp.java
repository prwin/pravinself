package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("applicationcontext.xml");
		
		//retrive bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//call meth on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call new meth for fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
context.close();
	}

}
