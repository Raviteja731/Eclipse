package com.xworkz.oct24;

public class Saloon {

	public  String gender="Men";
	public static String shopName ; 
	public int price; 
	public int since ;  
	public String address; 
	
	public Saloon(int price)
		{
		this.price = price;
		}
	
	static 
		{
		Saloon.shopName ="Men will men";
				
		}
	
	public  void setsince(int since) {
		this.since=since;
		}
	
	public void display() {
		System.out.println("Saloon shopName :"+Saloon.shopName);
		System.out.println("Saloon gender :"+this.gender);
		System.out.println("Saloon price :"+this.price);
		System.out.println("Saloon since :"+this.since);
		System.out.println("Saloon address :"+this.address);
	}

}
