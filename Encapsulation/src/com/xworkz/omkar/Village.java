package com.xworkz.omkar;

public class Village {

	public Taluk taluk;
	
	public void useTaluk(Taluk taluk)
	{
		System.out.println(taluk.getName());
		taluk.setName("Bellary");
		System.out.println("after updating :"+taluk.getName());
	}
}
