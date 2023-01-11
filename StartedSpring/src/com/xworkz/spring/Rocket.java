package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Lucky")
public class Rocket {

	@Value("India")
	private String country;
	@Value("PSLV")
	private String name;
	@Value("20000000")
	private long budget;
	
	public Rocket() {
		System.out.println("Running default const in Rocket");
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public long getBudget() {
		return budget;
	}
	
	
}
