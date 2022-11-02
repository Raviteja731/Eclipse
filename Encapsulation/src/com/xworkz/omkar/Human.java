package com.xworkz.omkar;

public class Human {

	private	String name = "Darshan";
	String colour;
	int eyes;
	int hands;
	int legs;
	int fingures;
	int teeth;
	int ears;
	boolean humanBeing;
	double height;
	double weight;
	
	public Human(String colour, int eyes, int hands, int legs, int fingures, int teeth, int ears, boolean humanBeing,
			double height, double weight) {
		this.colour = colour;
		this.eyes = eyes;
		this.hands = hands;
		this.legs = legs;
		this.fingures = fingures;
		this.teeth = teeth;
		this.ears = ears;
		this.humanBeing = humanBeing;
		this.height = height;
		this.weight = weight;
	}
	public String getName()
	{
		return this.name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	public void showOff()
	{
		System.out.println(this.humanBeing);
		System.out.println(this.colour);
		System.out.println(this.ears);
		System.out.println(this.eyes);
		System.out.println(this.fingures);
		System.out.println(this.hands);
		System.out.println(this.height);
		System.out.println(this.legs);
		System.out.println(this.teeth);
		System.out.println(this.weight);
		
	}
}
