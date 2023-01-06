package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Girl {


	public Girl() {
		System.out.println("Running default Constructor in Girl");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
