package com.xworkz.omkar;

public class Patas {

	public Temper temper;
	
	
	public void useTemper(Temper temper)
	{
		System.out.println(temper.getName());
		temper.setName("NTR");
		System.out.println("after updating :"+temper.getName());
		
	}
}
