package com.xworkz.base.base2;

public class Home  {

	public void name()
	{
		System.out.println("Running Name method");
	}
	public void location()
	{
		System.out.println("Running location method");
	}
	public void display()
	{
		this.location();
		this.name();
	}
}
