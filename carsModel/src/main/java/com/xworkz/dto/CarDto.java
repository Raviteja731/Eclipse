package com.xworkz.dto;

import lombok.Data;

@Data
public class CarDto {

	public String name;
	public int milage;
	public String model;
	private String colour;
	public int price;
	
	public CarDto() {
		System.out.println("created CarDto..."+getClass().getSimpleName());
	}
	
	
	
	
	@Override
	public String toString() {
		return "CarDto [name=" + name + ", milage=" + milage + ", model=" + model + ", colour=" + colour + ", price="
				+ price + "]";
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMilage() {
		return milage;
	}


	public void setMilage(int milage) {
		this.milage = milage;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	
}
    