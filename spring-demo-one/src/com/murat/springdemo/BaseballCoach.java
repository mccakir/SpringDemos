package com.murat.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for DI
	public BaseballCoach (FortuneService theFortuneService){
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut(){
		return "Spend 30 min on batting practice at kafasi";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune 
		return fortuneService.getFortune();
	}

}
