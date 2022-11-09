package com.xworkz.base.base2;

public class Moon {

	public int position;
	public double weight;
	public String colour;
	
	public Moon(int position, double weight, String colour) {
		this.position = position;
		this.weight = weight;
		this.colour = colour;
	}
	public void display()
	{
		System.out.println(this.position);
		System.out.println(this.colour);
		System.out.println(this.weight);
	}
	
}
