package com.xworkz.task;

public class Mountain {

	// name,location:custom,height,temple:custom showOff()
	
	public String name;
	public int height;
	public Temple temple = new Temple("Anjanadri", "Nanuuuu", 10000, "Dont Know Broo");
	public Location location = new Location("Bleeding Heart Yaru","Some Where","Neku Enduku ",420024,"On Earth");
	
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	public void showOff()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Height : "+this.height);
		this.location.showOff();
		this.temple.showOff();
	}
	
}
