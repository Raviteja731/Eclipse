package com.xworkz.task;

public class Weapon {
//  name,use,weight
	
	public String name;
	public String use;
	public int weight;
	
	public Weapon(String name, String use, int weight) {
		this.name = name;
		this.use = use;
		this.weight = weight;
	}
	public void showOff()
	{
		System.out.println("Weapon Name :"+this.name);
		System.out.println("Weapon Use :"+this.use);
		System.out.println("Weapon Weight in Tonnes :"+this .weight);
	}
	
}
