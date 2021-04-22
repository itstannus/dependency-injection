package com.itstannus.dependencyinjection.controllers;

import com.itstannus.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
	
	public GreetingService greetingService;
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}

}
