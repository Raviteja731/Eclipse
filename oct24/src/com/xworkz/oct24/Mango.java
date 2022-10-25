package com.xworkz.oct24;

public class Mango {

	public  String colour="Yellow";
	public static boolean sweet; 
	public int price; 
	public int weight ;  
	public String season; 
	
	public Mango(int price)
		{
		this.price = price;
		}
	
	static 
		{
		Mango.sweet =true;
				
		}
	
	public  void setweight(int weight) {
		this.weight=weight;
		}
	
	public void display() {
		System.out.println("colour :"+this.colour);
		System.out.println("Sweet :"+Mango.sweet);
		System.out.println("Price :"+this.price);
		System.out.println("Weightgms :"+this.weight);
		System.out.println("Season  :"+this.season);
	}

}
