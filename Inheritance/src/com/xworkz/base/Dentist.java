package com.xworkz.base;

public class Dentist extends Doctor {

	public String location;
	public int age;
	public double price;
	
	public void Dentist(ENT ent)
	{
		System.out.println(ent.city);
		System.out.println(equals(ent.fullForm));
		System.out.println(ent.gender);
		System.out.println(ent.specialist);
	}
	
}
