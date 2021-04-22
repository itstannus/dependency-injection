package com.itstannus.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.itstannus.dependencyinjection.controllers.ConstructorInjectedController;
import com.itstannus.dependencyinjection.controllers.I18NGreetingController;
import com.itstannus.dependencyinjection.controllers.MyController;
import com.itstannus.dependencyinjection.controllers.PetController;
import com.itstannus.dependencyinjection.controllers.PropertyInjectedController;
import com.itstannus.dependencyinjection.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DependencyInjectionApplication.class, args);
		
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
		
		System.out.println("---Internationalization Profile");
		I18NGreetingController i18NGreetingController= (I18NGreetingController) ctx.getBean("i18NGreetingController");
		System.out.println(i18NGreetingController.sayHello());
		
		System.out.println("---Primary Bean");
		MyController myController= (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		
		System.out.println("---Property");
		PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());
		
		System.out.println("---Setter");
		SetterInjectedController setterInjectedController= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());
		
		System.out.println("---Constructor");
		ConstructorInjectedController constructorInjectedController= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());
	}

}
