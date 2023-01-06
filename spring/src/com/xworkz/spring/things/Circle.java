package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Circle {

	public Circle() {
		System.out.println("Circle running");
	}

	@Override
	public String toString() {
		System.out.println("Running ToString Method");
		return "Surya";
	}

}
