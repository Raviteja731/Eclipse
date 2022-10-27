package com.xworkz.task;

import com.xworkz.Type;

public class Fuel {
	//  name,gstNo,location:custom,rating showOff()

	/* brand:custom,special:true,type:enum,price,quantity
showOff()-->brand.showOff
totalPrice() */
	
	public boolean special;
	public Type type= Type.ETHONAL;
	public int price;
	public int quantity;
	public Brand brand = new Brand("Hp", 104,"Mast");
	
	public Fuel(boolean special, int price, int quantity) {
		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}
	public void showOff()
	{
		System.out.println("Fuel Price :"+this.price);
		System.out.println("Tank quantity :"+this.quantity);
		System.out.println("Special :"+this.special);
		System.out.println("Fuel Type :"+this.type);
			this.brand.showOff();
	}
}
