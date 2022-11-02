package com.xworkz.omkar;

public class Delivery {

	public Flipkart flipkart;
	
	public void useCompanyName(Flipkart flipkart)
	{
		System.out.println(flipkart.getCompanyName());
		flipkart.setCompanyname("Amazon");
		
		System.out.println("after modifing :"+flipkart.getCompanyName());
	}
}
