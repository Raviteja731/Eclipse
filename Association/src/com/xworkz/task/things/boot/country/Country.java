package com.xworkz.task.things.boot.country;

public class Country {

	public String countrynName;
	public String captial;
	public City[] cities;
	public President president;
	
	public Country( President president,String countrynName, String captial) {
		this.countrynName = countrynName;
		this.captial = captial;
		this.president=president;
	}
	public void setcities(City[] cities)
	{
		this.cities=cities;
	}
	public void setPresident(President president)
	{
		this.president=president;
	}
	public void showOff()
	{
		System.out.println("Showing Country Details");
		System.out.println("Country Name :"+this.countrynName);
		System.out.println("Country Captial :"+this.captial);
		
		
		if(this.president!=null) {
			
		
		this.president.display();
		}
		if(this.cities!=null)
		{
		
		for (int i = 0; i < cities.length; i++) {
			City city = cities[i];
			
			if(city!=null) {}
			
			city.showOff();
		}
		
		}
	}
		
	}
	
	
	
	
	

