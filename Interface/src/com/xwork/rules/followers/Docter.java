package com.xwork.rules.followers;

import com.xwork.rules.HospitalRules;

public class Docter implements HospitalRules {

	@Override
	public boolean goodDocters() {
		System.out.println("Running goodDocters Method");
		return true;
	}

	@Override
	public int entryFee() {
		System.out.println("Running entryFee Method");
		return 15;
	}

}
