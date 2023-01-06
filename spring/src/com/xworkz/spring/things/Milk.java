package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Milk {


	public Milk() {
		System.out.println("Running default Constructor in Milk");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
