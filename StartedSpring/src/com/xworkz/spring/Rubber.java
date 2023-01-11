package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberPrice")
	private int price;
	@Autowired
	@Qualifier("rubberColour")
	private String colour;
	@Autowired
	@Qualifier("rubberShape")
	private String shape;
	@Autowired
	@Qualifier("rubberStolen")
	private boolean stolen;
	@Autowired
	@Qualifier("rubberSize")
	private int size;
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getShape() {
		return shape;
	}
	public int getSize() {
		return size;
	}
	
	public boolean getStolen() {
		return stolen;
	}
}
