package com.itstannus.dependencyinjection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.itstannus.dependencyinjection.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	void setUp() {
		constructorInjectedController= new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	void testGetGreetings() {
		System.out.println(constructorInjectedController.getGreetings());
	}

}
