package com.xwork.equal.boot;

import com.xwork.equal.WaterBottel;

public class WaterBottelRunner {

	public static void main(String[] args) {

		WaterBottel waterBottel = new WaterBottel("Water", "Bisleri", "Shashank", "Anu", 1995, true, 20, 5.32, 10, "Shubam");
		
		WaterBottel waterBottel2 = new WaterBottel("Water", "Bisleri", "Shashank", "Anu", 1995, true, 20, 5.32, 10, "Shubam");
		boolean same = waterBottel.equals(waterBottel2);
				System.out.println(same);
				
				System.out.println(waterBottel.toString());
				System.out.println(waterBottel2.toString());
	}

}
