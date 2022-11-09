package com.xworkz.base.base2;

public class Orion {

	public String location;
	public int noOfStaff;
	
	public Orion(String location, int noOfStaff) {
		this.location = location;
		this.noOfStaff = noOfStaff;
	}
	
	public void display()
	{
		System.out.println(this.location);
		System.out.println(this.noOfStaff);
	}
}
