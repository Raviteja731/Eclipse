package com.xworkz.omkar;

public class Kangaroo {

	public Africa africa;
	
	public void useAfrica(Africa africa)
	{
		System.out.println(africa.getAreaInSquareKms());
		africa.setAreaInSquareKms(5974223);
		System.out.println("after updating :"+africa.getAreaInSquareKms());
		
	}
}
