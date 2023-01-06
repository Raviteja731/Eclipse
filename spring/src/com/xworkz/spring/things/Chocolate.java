package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Chocolate {


	public Chocolate() {
		System.out.println("Running default Constructor in Chocolate");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
