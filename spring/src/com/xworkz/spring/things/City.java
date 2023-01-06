package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class City {


	public City() {
		System.out.println("Running default Constructor in City");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
