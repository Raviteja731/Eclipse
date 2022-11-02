package com.xworkz.omkar;

public class Flipkart {

	private String companyName = "Flipkart";
	String ownerName;
	String headquaters;
	int founded;
	int noOfStaff;
	int noOfFloors;
	long perDayProfit;
	int noOfDeliverysPerDay;
	int noOfOrdersPerDay;
	int noOfRejactionsPerDay;
	int noOfExchangesPerDay;
	
	public Flipkart(String ownerName, String headquaters, int founded, int noOfStaff, int noOfFloors, long perDayProfit,
			int noOfDeliverysPerDay, int noOfOrdersPerDay, int noOfRejactionsPerDay, int noOfExchangesPerDay) {
		this.ownerName = ownerName;
		this.headquaters = headquaters;
		this.founded = founded;
		this.noOfStaff = noOfStaff;
		this.noOfFloors = noOfFloors;
		this.perDayProfit = perDayProfit;
		this.noOfDeliverysPerDay = noOfDeliverysPerDay;
		this.noOfOrdersPerDay = noOfOrdersPerDay;
		this.noOfRejactionsPerDay = noOfRejactionsPerDay;
		this.noOfExchangesPerDay = noOfExchangesPerDay;
	}
	public String getCompanyName()
	{
		return this.companyName;
	}
	void setCompanyname(String companyName)
	{
		this.companyName=companyName;
	}
	public void showOff()
	{
		System.out.println(this.founded);
		System.out.println(this.headquaters);
		System.out.println(this.noOfDeliverysPerDay);
		System.out.println(this.noOfExchangesPerDay);
		System.out.println(this.noOfFloors);
		System.out.println(this.noOfOrdersPerDay);
		System.out.println(this.noOfRejactionsPerDay);
		System.out.println(this.noOfStaff);
		System.out.println(this.ownerName);
		System.out.println(this.perDayProfit);
		
	}
}
