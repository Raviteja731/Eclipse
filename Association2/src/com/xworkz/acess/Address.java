package com.xworkz.acess;

public class Address {

	public int pincode;
	public Location location;
	
	
	public Address(int pincode, Location location) {
		this.pincode = pincode;
		this.location = location;
	}


	public void showOff()
	{
		System.out.println("====Showing Address pincode====");
		System.out.println("Address Pincode :"+this.pincode);
		
		if(location!=null)
		{
			this.location.showOff();
		}
	}
	
}
