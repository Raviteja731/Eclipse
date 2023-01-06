package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Mall {


	public Mall() {
		System.out.println("Running default Constructor in MAll");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
