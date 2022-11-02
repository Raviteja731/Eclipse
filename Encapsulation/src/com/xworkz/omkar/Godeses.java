package com.xworkz.omkar;

public class Godeses {

	public God god;
	
	public void useGod(God god)
	{
		System.out.println(god.getName());
		god.setName("Vishnu");
		System.out.println("after modifing :"+god.getName());
		
	}
}
