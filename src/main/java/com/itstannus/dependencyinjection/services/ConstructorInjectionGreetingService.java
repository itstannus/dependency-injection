package com.itstannus.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionGreetingService implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello World - Constructor";
	}

}
