package com.xworkz.oct24;

public class Cracker {

	public Location location=Location.KARNATAKA;
	public static boolean sound;
	public String pack = "FamilyPack"; //literal
	public int price; //const
	public int quantity;  //method
	public String shopName; // ref
	
	public Cracker(int price)
		{
		this.price = price;  
		}
	
	static 
		{
		Cracker.sound =true;
		}
	
	public  void setquantity(int quantity) {
		this.quantity=quantity;
		}
	
	public void display() {
		System.out.println("Shop Location :"+this.location);
		System.out.println("Cracker Name :"+this.pack);
		System.out.println("Cracker color :"+this.price);
		System.out.println("Cracker price :"+Cracker.sound);
		System.out.println("Cracker Shape :"+this.quantity);
		System.out.println("Cracker Shopname :"+this.shopName);
	}
	
	

}
