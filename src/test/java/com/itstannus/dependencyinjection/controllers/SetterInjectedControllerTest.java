package com.itstannus.dependencyinjection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.itstannus.dependencyinjection.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setUp() {
		setterInjectedController= new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testSetGreetingService() {
		System.out.println(setterInjectedController.getGreetings());
	}

}
