package com.xworkz.base.base2;

public class Criminal {

	public String offence;
	public int number;
	public String name;
	public int age;
	
	public Criminal(String offence, int number, String name, int age) {
		this.offence = offence;
		this.number = number;
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.number);
		System.out.println(this.offence);
	}
	
}
