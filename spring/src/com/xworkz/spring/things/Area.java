package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Area {


	public Area() {
		System.out.println("Running default Constructor in Area");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
