package com.xworkz.omkar;

public class Baby {

	public Diapers diapers;
	
	public void useDiapers(Diapers diapers)
	{
		System.out.println(diapers.getBrandName());
		diapers.setBrandName("Huggies Wonder Pants");
		System.out.println("after updating :"+diapers.getBrandName());
	}
}
