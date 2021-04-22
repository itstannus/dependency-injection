package com.itstannus.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionGreetingService implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello World - Setter";
	}

}
