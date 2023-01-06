package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mask {


	public Mask() {
		System.out.println("Running default Constructor in MAsk");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
