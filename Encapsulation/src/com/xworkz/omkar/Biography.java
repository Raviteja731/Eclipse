package com.xworkz.omkar;

public class Biography {

	public Darshan darshan;
	
	public void useDarshan(Darshan darshan)
	{
		System.out.println(darshan.getWifeName());
		darshan.setWifeName("Srujana");
		System.out.println("after updating :"+darshan.getWifeName());

		
		}
}
