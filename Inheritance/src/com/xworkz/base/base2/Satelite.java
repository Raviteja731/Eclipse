package com.xworkz.base.base2;

public class Satelite extends Moon {

	public String name;
	public boolean isro;
	
	public Satelite(int position, double weight, String colour, String name, boolean isro) {
		super(position, weight, colour);
		this.name = name;
		this.isro = isro;
	}
	public void display()
	{
		super.display();
		System.out.println(this.isro);
		System.out.println(this.name);
		
	}
	
}
