package com.xwork.equal.boot;

import com.xwork.equal.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("Honda", "Amasader", "VK", "Lakshmi", 1947, "Omkar", 202003.2, 105009.3, 200303.3, true);
		
		Vehicle vehicle2 = new Vehicle("Honda", "Amasader", "VK", "Lakshmi", 1947, "Omkar", 202003.2, 105009.3, 200303.3, true);
		boolean same = vehicle.equals(vehicle2);
		System.out.println(same);
		
		System.out.println(vehicle.toString());
		System.out.println(vehicle.toString());
	}

}
