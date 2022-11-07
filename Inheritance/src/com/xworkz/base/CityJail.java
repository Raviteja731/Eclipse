package com.xworkz.base;

public class CityJail extends Jail {

	public String mlaName;
	public String gender;
	
	public void CityJail(SupremCourt supremCourt)
	{
		System.out.println(supremCourt.judgeName);
		System.out.println(supremCourt.location);
	}
}
