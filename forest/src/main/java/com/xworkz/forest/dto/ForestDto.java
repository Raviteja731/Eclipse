package com.xworkz.forest.dto;

public class ForestDto {

	private String name;
	private String state;
	private String area;
	private String type;
	
	public ForestDto() {
		System.out.println("Created ForestDto"+getClass().getSimpleName());
	}
	
	
	@Override
	public String toString() {
		return "ForestDto [name=" + name + ", state=" + state + ", area=" + area + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
