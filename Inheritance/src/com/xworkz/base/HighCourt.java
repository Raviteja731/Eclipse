package com.xworkz.base;

public class HighCourt extends Court {
	
	public String location;
	public String judgeName;
	
	
	public void HighCourt(SupremCourt supremCourt)
	{
		System.out.println(supremCourt.judgeName);
		System.out.println(supremCourt.location);
	}
}
