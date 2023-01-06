package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Application {

	public Application() {
		System.out.println("Running default Constructor in Application");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
