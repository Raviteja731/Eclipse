package com.xworkz.omkar;

public class Rocket {

	public Aeroplane aeroplane;
	
	public void useAeroplane(Aeroplane aeroplane)
	{
		System.out.println(aeroplane.getCompanyName());
		aeroplane.setCompanyName("Booing");
		System.out.println("after updating :"+aeroplane.getCompanyName());
	}
}
