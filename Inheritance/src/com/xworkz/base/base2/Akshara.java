package com.xworkz.base.base2;

public class Akshara extends HR {

	@Override
	public void take()
	{
		System.out.println("running inherited take method");
	}
	
	public void display()
	{
		super.display();
		this.take();
	}
}
