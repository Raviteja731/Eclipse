package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Park {


	public Park() {
		System.out.println("Running default Constructor in Park");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
