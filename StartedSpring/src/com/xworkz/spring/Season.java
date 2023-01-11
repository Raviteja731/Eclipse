package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("surya")
public class Season {

	private String name;
	private int duration;
	private String startingMonth;
	
	
	
	public Season(String name, int duration, String startingMonth) {
		super();
		this.name = name;
		this.duration = duration;
		this.startingMonth = startingMonth;
	}

	@Value("Baragal")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("3")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Value("May")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

	public Season() {
		System.out.println("created default const in Season");
	}
		
	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}
}
