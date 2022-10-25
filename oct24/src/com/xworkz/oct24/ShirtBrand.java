package com.xworkz.oct24;

public class ShirtBrand {

	public String Brand; 
	public  int since=1947;
	public static int size; 
	public int price; 
	public String shopName ;  
	
	public ShirtBrand(int price)
		{
		this.price = price;
		}
	
	static 
		{
		ShirtBrand.size =32;
				
		}
	
	public  void setprice(String shopName) {
		this.shopName=shopName;
		}
	
	public void display() {
		System.out.println("Brand :"+this.Brand);
		System.out.println("Gender :"+ShirtBrand.size);
		System.out.println("Price :"+this.price);
		System.out.println("since :"+this.since);
		System.out.println("shopName  :"+this.shopName);
	}

}
