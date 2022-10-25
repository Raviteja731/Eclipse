package com.xworkz.oct24.boot;

import com.xworkz.oct24.Sweet;
public class SweetRunner {

	public static void main(String[] args) {

		Sweet sweet = new Sweet(150);
		sweet.shopName = "Om Sweets";
		sweet.Shape = "Square";
		
		
		sweet.display();	
	}

}
