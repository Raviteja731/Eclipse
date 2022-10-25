package com.xworkz.oct14;

public enum Name {

	ARJUN(4,"red"),MAHENDRA(5,"blue"),SWARAJ(8,"green"),JHON_DEER(7,"yellow");
	
	public double hp;
	public String colour;
	private Name(double hp,String colour)
	{
		this.hp=hp;
		this.colour=colour;
		
		
	}
	
}
