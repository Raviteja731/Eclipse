package com.xwork.equal.boot;

import com.xwork.equal.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {

		Institution institution = new Institution("Xworkz", "Omkar", "RajajiNagar", "Banglore", "Karnataka", "Mamatha", 22000, 6, 50, 4);
		
		Institution institution2 = new Institution("Xworkz", "Omkar", "RajajiNagar", "Banglore", "Karnataka", "Mamatha", 22000, 6, 50, 4);
		
		boolean same = institution.equals(institution2);
		System.out.println(same);
		
		System.out.println(institution.toString());
		System.out.println(institution2.toString());
	}

}
