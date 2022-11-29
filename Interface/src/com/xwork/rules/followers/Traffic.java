package com.xwork.rules.followers;

import com.xwork.rules.TrafficRules;

public class Traffic implements TrafficRules {

	@Override
	public boolean wearHelmet() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean fines() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int speeedLimit() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public boolean mandatoryDoc() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int fine() {
		// TODO Auto-generated method stub
		return 100;
	}

}
