package com.xworkz.oct24;

public class Sweet {

	public Location location=Location.ANDRAPRADEH;
	public static String colour;
	public String sweetName  = "Putharekulu"; //literal
	public int price; //const
	public String Shape;  //method
	public String shopName; // ref
	
	public Sweet(int price)
		{
		this.price = price;
		}
	
	static 
		{
		Sweet.colour ="White";
		}
	
	public  void setShape(String shape) {
		this.Shape=shape;
		}
	
	public void display() {
		System.out.println("Shop Location :"+this.location);
		System.out.println("Sweet Name :"+this.sweetName);
		System.out.println("Sweet color :"+Sweet.colour);
		System.out.println("Sweet price :"+this.price);
		System.out.println("Sweet Shape :"+this.Shape);
		System.out.println("Sweet Shopname :"+this.shopName);
	}
	
	
}
