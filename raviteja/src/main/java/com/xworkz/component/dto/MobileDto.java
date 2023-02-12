package com.xworkz.component.dto;


public class MobileDto {

	private String brand;
	private double price;
	private double weight;
	private String colour;
	private String country;
	
	public MobileDto() {
	System.out.println("created MobileDto...."+getClass().getSimpleName());
	}
	
	

	public MobileDto(String brand, double price, double weight, String colour, String country) {
		super();
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
		this.country = country;
	}



	@Override
	public String toString() {
		return "MobileDto [brand=" + brand + ", price=" + price + ", weight=" + weight + ", colour=" + colour
				+ ", country=" + country + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
