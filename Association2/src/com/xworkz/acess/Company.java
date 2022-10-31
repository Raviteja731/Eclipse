package com.xworkz.acess;

public class Company {

	public String Name;
	public String ownerName;
	public Address address;
	
	
	public Company(String name, String ownerName, Address address) {
		Name = name;
		this.ownerName = ownerName;
		this.address = address;
	}


	public void showOff()
	{
		System.out.println("====showing Company Details====");
		System.out.println("Company Name :"+this.Name);
		System.out.println("Owner name :"+this.ownerName);
		
		if(address!=null)
		{
			this.address.showOff();
		}
	}
}
