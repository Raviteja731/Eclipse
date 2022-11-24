package com.xwork.equal.boot;

import com.xwork.equal.Mobile;

public class MobileRunner {

	public static void main(String[] args) {

		Mobile mobile = new Mobile("Samsaung", "gold", "Suresh Mobiles", 10000, "India", 1999, 5.6, 4, 32, true);
		
		Mobile mobile2 = new Mobile("Samsaung", "gold", "Suresh Mobiles", 10000, "India", 1999, 5.6, 4, 32, true);
		boolean same = mobile.equals(mobile2);
		System.out.println(same);
		
		System.out.println(mobile.toString());
		System.out.println(mobile2.toString());
	}

}
