package com.xworkz.omkar;

public class Remote {
	
	public Tv tv;
	
	public void useTv(Tv tv)
	{
		System.out.println(tv);// FQn
		System.out.println(tv.ambassador);//null
		System.out.println(tv.access);//null
		System.out.println("TV Brand :"+tv.getBrand());// BPL
		tv.setBrand("APL");
		
		System.out.println("after modifing :"+tv.getBrand());
		
	}
	
	
}
