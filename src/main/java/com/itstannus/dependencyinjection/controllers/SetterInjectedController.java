package com.itstannus.dependencyinjection.controllers;

import com.itstannus.dependencyinjection.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String getGreetings() {
		return greetingService.sayGreetings();
	}

}
