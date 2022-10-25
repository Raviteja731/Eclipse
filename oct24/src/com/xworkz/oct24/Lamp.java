package com.xworkz.oct24;

public final class Lamp {

	//public Location location=Location.ANDRAPRADEH;
	public static String colour;
	public String brand = "Ikea Forsa"; 
	public int price; 
	public int watts ;  
	public String shopName; 
	
	public Lamp(int price)
		{
		this.price = price;
		}
	
	static 
		{
		Lamp.colour ="Warm White"
				+ "";
		}
	
	public  void setsince(int watts) {
		this.watts=watts;
		}
	
	public void display() {
		//System.out.println("Shop Location :"+this.location);
		System.out.println("Lamp brand :"+this.brand);
		System.out.println("Lamp color :"+Lamp.colour);
		System.out.println("Lamp price :"+this.price);
		System.out.println("Lamp watts :"+this.watts);
		System.out.println("Flower Shopname :"+this.shopName);
	}

}
