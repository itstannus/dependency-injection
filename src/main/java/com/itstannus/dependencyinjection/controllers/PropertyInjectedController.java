package com.itstannus.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.itstannus.dependencyinjection.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyInjectionGreetingService")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}

}
