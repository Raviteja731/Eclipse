package com.xworkz.oct14;

public class Tractor {

	public Name name;  
	public String brand;
	public int price;   
	public String colour;
	public int[] hp;
	public String[] model={"ram"};
	
	
	public Tractor()
	{}
	public Tractor(Name name) 
	{
		this();                                         //super  chaining
		                                                //this
	this.name=name;
	System.out.println("Displayed tractor name  :"+this.name);
	
	
	}
	
	public Tractor(int[] hp) 
	{                                                               
		this();
	this.hp=hp;
	System.out.println("Displayrd tractor name,hp using const ");
	}
	public Tractor(String colour,String brand) 
	{
		this();
	this.colour=colour;
	this.brand=brand;
	System.out.println("Displayrd tractor name,hp using const ");
	}
public  void display()
{

	System.out.println(this.name);
	System.out.println(this.brand);
	System.out.println(this.colour);
	for (int i = 0; i < model.length; i++) {
		String string = model[i];
		System.out.println(string);
		
	}
	for (int i = 0; i < hp.length; i++) {
	
		System.out.println(hp[i]);
	}
	
}
	
}
