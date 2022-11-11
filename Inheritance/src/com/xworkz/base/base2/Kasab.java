package com.xworkz.base.base2;

public class Kasab extends Terrorist {

	public void country()
	{
		System.out.println("Running inherited country method");
	}
	public void display()
	{
		super.display();
		this.country();
	}
}
