package com.xworkz.base.base2;

public class ShoppingMall extends Orion {

	public String ownerName;
	public int noOfStaff;

	public ShoppingMall(String location,int noOfStaff,String ownerName,int noOfStaff1)
	{
		super(location,noOfStaff1);
		this.ownerName=ownerName;
		this.noOfStaff=noOfStaff1;
	}
	
	public void display() {
		super.display();
		System.out.println(this.ownerName);
		System.out.println(this.noOfStaff);
	}
}
