package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Road {

	public Road() {
		System.out.println("Running Default constructor in Road");
	}
	@Override
	public String toString() {

		return "Surya";
	}
}
