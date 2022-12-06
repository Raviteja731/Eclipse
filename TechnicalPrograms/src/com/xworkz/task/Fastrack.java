package com.xworkz.task;

public class Fastrack extends Digital {

	public String brand;
	
	
	
	public int manufYear() 
	{
		return 2011 ;
	}
	@Override
 public	String qualitygood()
	{
		System.out.println("Running fastrack method");
		return "No";
	}
}
