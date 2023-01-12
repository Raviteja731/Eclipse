package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	@Autowired
	@Qualifier("snakeName")
	private String name;
	@Autowired
	private double length;
	@Autowired
	private String colour;
	@Autowired
	@Qualifier("snakeType")
	private String type;
	@Autowired
	private boolean poisinous;
	
	@Autowired
	public Snake(String name, String type, boolean poisinous) {
		super();
		this.name = name;
		this.type = type;
		this.poisinous = poisinous;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isPoisinous() {
		return poisinous;
	}
	public void setPoisinous(boolean poisinous) {
		this.poisinous = poisinous;
	}
	
	
}
