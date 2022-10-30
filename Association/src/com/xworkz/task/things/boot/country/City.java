package com.xworkz.task.things.boot.country;

public class City {

	public Name name;
	public String captial;
	public double areaInSquareKms;
	
	public City(Name name,String captial, double areaInSquareKms) {
		this.captial = captial;
		this.areaInSquareKms = areaInSquareKms;
		this.name= name;
	}
	public void showOff()
	{
		System.out.println("Captial :"+this.captial);
		System.out.println("Area in square kms :"+this.areaInSquareKms);
		if(name!=null)
		{
			
			this.name.showOff();
		}
	}
	
}
