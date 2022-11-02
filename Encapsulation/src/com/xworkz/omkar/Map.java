package com.xworkz.omkar;

public class Map {

	public Country country;
	
	
	public void useCountry(Country country)
	{
		System.out.println(country.getName());
		country.setName("India");
		System.out.println("after updating :"+country.getName());
	}
}
