package com.xworkz.oct24.boot;

import com.xworkz.oct24.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {

		Cracker cracker = new Cracker(150);
		cracker.shopName = "Om Crackers";
		cracker.quantity = 100;
		
		cracker.display();	

	}

}

