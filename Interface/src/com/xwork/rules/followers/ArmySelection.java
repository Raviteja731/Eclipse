package com.xwork.rules.followers;

import com.xwork.rules.ArmySelectionRules;

public class ArmySelection implements ArmySelectionRules {

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public boolean healthy() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean goodFitness() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean goodInRunning() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean daring() {
		// TODO Auto-generated method stub
		return true;
	}

}
