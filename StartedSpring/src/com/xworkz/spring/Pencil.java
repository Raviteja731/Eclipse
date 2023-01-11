package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilPrice")
	private int price;
	@Autowired
	@Qualifier("pencilColour")
	private String colour;
	@Autowired
	@Qualifier("pencilSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("pencilStolean")
	private boolean stolen;
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getColour() {
		return colour;
	}
	
	public boolean getSharp() {
		return sharp;
	}
	
	public boolean getStolen() {
		return stolen;
	}
}
