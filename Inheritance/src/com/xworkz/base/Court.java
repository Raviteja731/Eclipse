package com.xworkz.base;

public class Court {

	public String location;
	public String judgeName;
	
	public void Court(HighCourt highCourt)
	{
		System.out.println(highCourt.judgeName);
		System.out.println(highCourt.location);
	}
}
