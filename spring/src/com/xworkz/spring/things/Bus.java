package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Bus {


	public Bus() {
		System.out.println("Running default Constructor in Bus");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
