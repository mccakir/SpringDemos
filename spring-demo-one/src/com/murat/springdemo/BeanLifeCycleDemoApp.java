package com.murat.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same address
		boolean result= (theCoach==alphaCoach);
		
		System.out.println("\nPointing to the same object "+ result);
		
		System.out.println("\nMemory location for the coach: "+theCoach);

		System.out.println("\nMemory location for the coach: "+alphaCoach+ "\n");
		
		
		//close context
		context.close();
	}

}
