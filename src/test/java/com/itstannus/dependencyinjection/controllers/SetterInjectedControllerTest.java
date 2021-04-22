package com.itstannus.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.itstannus.dependencyinjection.services.SetterInjectionGreetingService;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setUp() {
		setterInjectedController= new SetterInjectedController();
		setterInjectedController.setGreetingService(new SetterInjectionGreetingService());
	}

	@Test
	void testSetGreetingService() {
		System.out.println(setterInjectedController.getGreetings());
	}

}
