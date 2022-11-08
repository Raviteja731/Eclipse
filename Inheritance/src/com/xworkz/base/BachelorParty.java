package com.xworkz.base;

public class BachelorParty extends WeekEndPartys{

	public String brand;
	public boolean weekEndPartys;
	public boolean freedom;
	

	public BachelorParty(String barName, String location, double quantiy, String brand, boolean weekEndPartys,
			boolean freedom) {
		super(barName, location, quantiy);
		this.brand = brand;
		this.weekEndPartys = weekEndPartys;
		this.freedom = freedom;
	}
	
	
	
}
