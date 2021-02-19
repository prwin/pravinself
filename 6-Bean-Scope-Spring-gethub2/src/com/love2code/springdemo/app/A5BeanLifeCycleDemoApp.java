package com.love2code.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love2code.springdemo.Coach;

public class A5BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// Load Spring Config file
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("A4beanLifeCycle-applicationcontext2.xml");

		//retrive bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout()+theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
