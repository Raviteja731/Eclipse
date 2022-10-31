package com.xworkz.acess;

public class City {

	public String cityName;
	public String famousPlace;
	public String famousTemple;
	public String famousStreetFood;
	public String dcName;
	
	public City(String cityName, String famousPlace, String famousTemple, String famousStreetFood, String dcName) {
		this.cityName = cityName;
		this.famousPlace = famousPlace;
		this.famousTemple = famousTemple;
		this.famousStreetFood = famousStreetFood;
		this.dcName = dcName;
	}
	public void showOff()
	{
		System.out.println("====showing City Details=====");
		System.out.println("City Name :"+this.cityName);
		System.out.println("DC Name :"+this.dcName);
		System.out.println("Famous Place :"+this.famousPlace);
		System.out.println("Famous Temple :"+this.famousTemple);
		System.out.println("Famous Street food :"+this.famousStreetFood);
	}
}
