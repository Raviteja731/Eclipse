package com.xworkz.base.boot;

import com.xworkz.base.BachelorParty;
import com.xworkz.base.WeekEndPartys;

public class WeekEndPartysRunner {

	public static void main(String[] args) {

		WeekEndPartys weekEndPartys = new WeekEndPartys("Venkateshwara Bar & Restaurants", "Basaveshwara Nagar", 5);
		
		WeekEndPartys weekEndPartys2 = new BachelorParty("Venkateshwara Bar & Restaurants", "Basaveshwara Nagar", 5, "Whisky", false, false);
		
		BachelorParty bachelorParty = new BachelorParty("Venkateshwara Bar & Restaurants", "Basaveshwara Nagar", 5, "Whisky", false, false);
		System.out.println(bachelorParty.barName);
		System.out.println(bachelorParty.location);
		System.out.println(bachelorParty.brand);
		System.out.println(bachelorParty.quantiy);
		System.out.println(bachelorParty.freedom);
		System.out.println(bachelorParty.weekEndPartys);
	}

}
