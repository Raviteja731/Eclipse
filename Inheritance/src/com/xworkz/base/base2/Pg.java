package com.xworkz.base.base2;

public class Pg extends Home {

	
	public void location()
	{
		System.out.println("Running location method");
	}
	public void display()
	{
		super.display();
		this.location();
	}
}
