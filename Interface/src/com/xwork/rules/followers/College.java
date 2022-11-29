package com.xwork.rules.followers;

import com.xwork.rules.CollegeRules;

public class College implements CollegeRules {

	public String city;
	public int pincode;
	
	@Override
	public boolean uniform() 
	{
		System.out.println("Running uniform method");
		return true;
	}

	@Override
	public boolean idtags()
	{
		System.out.println("Running idtages method");
		return true;
	}

	@Override
	public boolean dailyAttendence() 
	{
		System.out.println("Running dailyAttendence method");
		return true;
	}

	public College(String city,int pincode) 
	{
		super();
	}

	@Override
	public int noOfStaff() 
	{
		System.out.println("Running noOfStaff method");
		return 50;
	}

	@Override
	public String schoolName() 
	{
		System.out.println("Running schoolName method");
		return "Xworkz";
	}
	
}
