package com.xworkz.base.boot;

import com.xworkz.base.Engagement;
import com.xworkz.base.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {

		Marriage marriage = new Engagement("Omkar", "Mamatha", "N S Palace ");
		
		Marriage marriage2 = new Marriage("Omkar", "Mamatha", "N S Palace ");
		
		Engagement engagement = new Engagement("Omkar", "Mamatha", "N S Palace Banglore ");
		System.out.println("Bidegroom Name :"+engagement.bidegroom);
		System.out.println("Bride Name :"+engagement.bride);
		System.out.println("Location :"+engagement.location);
		
	}

}
