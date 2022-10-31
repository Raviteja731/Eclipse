package com.xworkz.acess;

public class Country {

	public String countyName;
	public String captialCity;
	public String presidentName;
	public String countryCode;											// +91
	
	public Country(String countyName, String captialCity, String presidentName, String countryCode) {
		this.countyName = countyName;
		this.captialCity = captialCity;
		this.presidentName = presidentName;
		this.countryCode = countryCode;
	}
	public void shoowOff()
	{
		System.out.println("====Showing Country Details====");
		System.out.println("Country Name :"+this.countyName);
		System.out.println("Country Captial :"+this.captialCity);
		System.out.println("Country Code :"+this.countryCode);
		System.out.println("President name :"+this.presidentName);
		
	}
	
}
