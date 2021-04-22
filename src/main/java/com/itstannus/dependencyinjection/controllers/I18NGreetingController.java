package com.itstannus.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.itstannus.dependencyinjection.services.GreetingService;

@Controller
public class I18NGreetingController {
	
	private final GreetingService greetingService;

	public I18NGreetingController(@Qualifier("i18nService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreetings();
	}

}
