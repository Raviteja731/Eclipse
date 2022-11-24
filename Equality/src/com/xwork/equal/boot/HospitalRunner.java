package com.xwork.equal.boot;

import com.xwork.equal.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital hospital = new Hospital("VIMS", "OPD", "Bellari", "Karnataka", "Prashant", 100, 100, true, 10, true);
		
		Hospital hospital2 = new Hospital("VIMS", "OPD", "Bellari", "Karnataka", "Prashant", 100, 100, true, 10, true);
		
		boolean same = hospital.equals(hospital2);
		System.out.println(same);
		
		System.out.println(hospital.toString());
		System.out.println(hospital2.toString());
				
	}

}
