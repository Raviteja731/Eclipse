package com.xwork.rules.followers;

import com.xwork.rules.AgricultureRules;

public class Agriculture implements AgricultureRules {

	@Override
	public int landArea() {
		// TODO Auto-generated method stub
		return 60;
	}

	@Override
	public String soilColour() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public boolean wayOfLife() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean organic() {
		// TODO Auto-generated method stub
		return true;
	}

}
