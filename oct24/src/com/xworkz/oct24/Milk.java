package com.xworkz.oct24;

public class Milk {

	public String from; 
	public  String colour="White";
	public static boolean sweet; 
	public int price; 
	public int calcium ;  
	
	public Milk(int price)
		{
		this.price = price;
		}
	
	static 
		{        
		Milk.sweet =true;
				
		}
	
	public  void setprice(int calcium) {
		this.calcium=calcium;
		}
	
	public void display() {
		System.out.println("colour :"+this.colour);
		System.out.println("Sweet :"+Milk.sweet);
		System.out.println("Price :"+this.price);
		System.out.println("from :"+this.from);
		System.out.println("calcium in mg  :"+this.calcium);
	}

}
