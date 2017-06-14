package com.murat.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach(){
		System.out.println("TennishCoach inside default constructor");
	}
	
	
	
//	//define a setter method
//	@Autowired
//	private void randomMethodName(FortuneService fortuneService) {
//		System.out.println("TennishCoach inside randomMethodName() method");
//		this.fortuneService = fortuneService;
//	}
	
	
//  Constructor injection	
//	@Autowired
//	public TennisCoach (FortuneService fortuneService){
//		this.fortuneService=fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	

}
