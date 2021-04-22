package com.itstannus.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.itstannus.dependencyinjection.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
//	@Autowired no need to mention this since Spring 4.2 for constructor injection
	public ConstructorInjectedController(@Qualifier("constructorInjectionGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
