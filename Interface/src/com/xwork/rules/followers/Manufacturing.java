package com.xwork.rules.followers;

import com.xwork.rules.ManufacturingRules;

public class Manufacturing implements ManufacturingRules {

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Iron";
	}

	@Override
	public int temp() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public boolean heat() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean unsafeToHumans() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String company() {
		// TODO Auto-generated method stub
		return "JSW";
	}

}
