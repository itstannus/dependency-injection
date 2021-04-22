package com.itstannus.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("MR")
@Service("i18nService")
public class I18NMarathiGreetingService implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Namaskar Mandali! - Marathi";
	}

}
