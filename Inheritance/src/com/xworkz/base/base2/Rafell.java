package com.xworkz.base.base2;

public class Rafell extends WarJet{

	public void pilotName()
	{
		System.out.println("Running pilotName method");
	}
	public void display()
	{
		super.display();
		pilotName();
	}
}
