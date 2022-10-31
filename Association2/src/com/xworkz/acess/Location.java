package com.xworkz.acess;

public class Location {

	public String street;
	public City city;
	public State state;
	public Country country;
	
	
	public Location(String street, City city, State state, Country country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public void showOff()
	{
		System.out.println("=====Showing Location Detais====");
		System.out.println("Street Name :"+this.street);
	
		if(country!=null)
		{
			this.country.shoowOff();
		}
		if(city!=null)
		{
			this.city.showOff();
		}
		if(state!=null)
		{
			this.state.showOff();	
		}
		
	}
}
