package com.itstannus.dependencyinjection.controllers;

import com.itstannus.dependencyinjection.services.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}