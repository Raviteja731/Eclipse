package com.xworkz.task;

public class Brand {
	//  street,city,state,pincode,country

	//  name,gstNo,location:custom,rating showOff()

	public String name;
	public long gstNo;
	public Location location = new Location("Bleeding Heart Yard","Some Where","Neku Enduku ",420024,"On Earth");
	public String rating;
	
	

	public Brand(String name, long gstNo, String rating) {
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}

	public void showOff()
	{
		
		System.out.println("Name :"+this.name);
		System.out.println("GSTNo :"+this.gstNo);
		System.out.println("Ratings :"+this.rating);
		this.location.showOff();
	}
}
