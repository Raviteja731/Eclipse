package com.xworkz.oct13;

public class Fish {

	public String name;
	public String type;
	public long price;
	public String weight;
	public double length;
	
	public Fish() 
	{
		System.out.println("Displayed Fish default details");
	}
	public Fish(String name,long price)
	{
		this.name=name;
		this.price=price;
		System.out.println("Displayed Fish details using para String const");
	}
	public Fish(double length,String type)
	{
		this.length=length;
		this.type=type;
		System.out.println("Displayed Fish details using para String const");
	}
	public Fish(String weight)
	{
		this.weight=weight;
		System.out.println("Displayed Fish weight using String para const");
	}
	public Fish(long price)
	{
		this.price=price;
		System.out.println("---------------");
	}
	public Fish(double length)
	{
		this.length=length;
		System.out.println("---------------");
	}
	public Fish(String weight,String name)
	{
		this.weight=weight;
		this.name=name;
		System.out.println("---------------");
	}
	public Fish(long price,double length)
	{
		this.length=length;
		this.price=price;
		System.out.println("---------------");
	}
	public Fish(String name,String weight,long price,double length,String type)
	{
		this.name=name;
		this.type=type;
		this.price=price;
		this.length=length;
		this.weight=weight;
		System.out.println("---------------");
	}
}
