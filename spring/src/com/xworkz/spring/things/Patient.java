package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Patient {


	public Patient() {
		System.out.println("Running default Constructor in PAtient");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
