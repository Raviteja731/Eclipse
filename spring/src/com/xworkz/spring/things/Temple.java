package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Temple {


	public Temple() {
		System.out.println("Running default Constructor in Temple");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
