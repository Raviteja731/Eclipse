package com.xworkz.task;

public class Location {

	//  street,city,state,pincode,country
	
	public String street;
	public String city;
	public String state;
	public int pinCode;
	public String country;
	
	public Location()
	{
		
	}
	
	
	public Location(String street, String city, String state, int pinCode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}
	
	public void showOff()
	{
		System.out.println("Street :"+this.street);
		System.out.println("Pincode :"+this.pinCode);
		System.out.println("City name :"+this.city);
		System.out.println("State Name :"+this.state);
		System.out.println("Country NAme :"+this.country);
	}
	
}
