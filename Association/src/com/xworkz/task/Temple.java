package com.xworkz.task;

public class Temple {

	// name,god:custom,mainPriest,noOfVisitor,collectionPerDay
	
	public String name;
	public String mainPriest;
	public int noOfVisitor;
	public String collectionPerDay;
	public God god = new God("Hanuman", "Male", "Ram");
	
	public Temple(String name, String mainPriest, int noOfVisitor, String collectionPerDay) {
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitor = noOfVisitor;
		this.collectionPerDay = collectionPerDay;	
	}
	public void showOff()
	{
		System.out.println("Temple Name :"+this.name);
		System.out.println("Main Priest :"+this.mainPriest);
		System.out.println("No Of Visitors/day:"+this.noOfVisitor);
		System.out.println("Collection/day :"+this.collectionPerDay);
			this.god.showOff();
	}
}
