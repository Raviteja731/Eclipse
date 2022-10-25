package com.xworkz.oct24;

public class Flower {

	public Location location=Location.ANDRAPRADEH;
	public static String colour;
	public String flowerName  = "Pushpa"; 
	public int price; 
	public boolean flowerSmells ;  
	public String shopName; 
	
	public Flower(int price)
		{
		this.price = price;
		}
	
	static 
		{
		Flower.colour ="Erupuu";
		}
	
	public  void setflowerSmells(boolean flowerSmells) {
		this.flowerSmells=flowerSmells;
		}
	
	public void display() {
		System.out.println("Shop Location :"+this.location);
		System.out.println("Flower Name :"+this.flowerName);
		System.out.println("Flower color :"+Flower.colour);
		System.out.println("Flower price :"+this.price);
		System.out.println("Flower Shape :"+this.flowerSmells);
		System.out.println("Flower Shopname :"+this.shopName);
	}

}
