package com.xworkz.omkar;

public class Being {

	public Human human;
	
	public void useHuman(Human human)
	{
		System.out.println(human.getName());
		human.setName("Shubam");
		System.out.println("after updating :"+human.getName());
	}
}
