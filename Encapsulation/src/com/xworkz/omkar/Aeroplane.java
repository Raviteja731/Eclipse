package com.xworkz.omkar;

public class Aeroplane {

	private String companyName = "Arun Aeroplane";
	long price;
	double length;
	double width;
	double weight;
	String colour;
	int capacity;
	int manufacturedYear;
	boolean advancedTchnology;
	int pilots;
	int noOfFlightAtenders;
	
	public String getCompanyName()
	{
		return this.companyName;
	}
	void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
}
