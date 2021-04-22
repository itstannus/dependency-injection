package com.itstannus.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.itstannus.dependencyinjection.services.GreetingService;
import com.itstannus.dependencyinjection.services.PropertyInjectionGreetingService;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController;
	GreetingService greetingService;
	
	@BeforeEach
	void setUp() {
		//Mimicking Spring framework
		propertyInjectedController= new PropertyInjectedController();
		propertyInjectedController.greetingService= new PropertyInjectionGreetingService();
	}
	
	@Test
	void testGetGreetings() {
		System.out.println(propertyInjectedController.getGreetings());
	}

}
