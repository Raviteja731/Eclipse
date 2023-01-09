package com.xworkz.spring;

import org.springframework.stereotype.Component;

@Component
public class Power {


	public Power() {
		System.out.println("Running Default constructor");
	}
	@Override
	public String toString() {
		
		return "Mass";
	}
}
