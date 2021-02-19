package com.love2code.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love2code.springdemo.Coach;

public class A2BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load Spring Config file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("A1beanScope-applicationcontext.xml");

		//retrive bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//to check both are same 
		boolean result=(theCoach==alphaCoach);
		
		
		//result is --
		System.out.println("pointing to same obj= "+result);
		
		System.out.println("\nmemory location for thecoach: "+theCoach);
		
		System.out.println("\nmemory location for alphacoach: "+alphaCoach);
		
		
		
		//
		context.close();
	}

}
