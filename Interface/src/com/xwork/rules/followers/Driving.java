package com.xwork.rules.followers;

import com.xwork.rules.DrivingRules;

public class Driving implements DrivingRules {

	@Override
	public boolean followTraficRules() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean drivingPerfect() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean drunkAndDrive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carryDocuments() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean vechicalGoodCondi() {
		// TODO Auto-generated method stub
		return true;
	}

}
