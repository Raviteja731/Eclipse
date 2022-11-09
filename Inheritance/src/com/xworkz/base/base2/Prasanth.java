package com.xworkz.base.base2;

public class Prasanth  {


	public String name;
	public String type;
	public int noOfMovies;
	
	public Prasanth(String name, String type, int noOfMovies) {
		this.name = name;
		this.type = type;
		this.noOfMovies = noOfMovies;
	}
	
	public void display()
	{
	  System.out.println(this.name);
	  System.out.println(this.type);
	  System.out.println(this.noOfMovies);
	}
	
	
}
