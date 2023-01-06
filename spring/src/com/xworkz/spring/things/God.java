package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component
public class God {


	public God() {
		System.out.println("Running default Constructor in God");
	}

	@Override
	public String toString() {
		System.out.println("Running toString Method");
		return "Surya";
	}
}
