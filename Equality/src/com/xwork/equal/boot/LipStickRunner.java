package com.xwork.equal.boot;

import com.xwork.equal.LipStick;

public class LipStickRunner {

	public static void main(String[] args) {

		LipStick lipStick = new LipStick("Nive", "Anjali Parlor", 150, 5.0, false, "Bad", "India", 2021, 2022, "Girls");
		
		LipStick lipStick2 = new LipStick("Nive", "Anjali Parlor", 150, 5.0, false, "Bad", "India", 2021, 2022, "Girls");
		
		boolean same = lipStick.equals(lipStick2);
		System.out.println(same);
		
		System.out.println(lipStick.toString());
		System.out.println(lipStick2.toString());
	}

}
