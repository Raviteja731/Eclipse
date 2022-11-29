package com.xwork.rules.followers.boot;

import com.xwork.rules.ArmySelectionRules;
import com.xwork.rules.followers.ArmySelection;

public class ArmySelectionRunner {

	public static void main(String[] args) {

		Object obj = new ArmySelection();
		
		ArmySelection army = new ArmySelection();
		
		ArmySelectionRules sele = new ArmySelection();
		
		System.out.println(army.daring());
		System.out.println(army.goodFitness());
		System.out.println(army.goodInRunning());
		System.out.println(army.healthy());
		System.out.println(army.height());
	}

}
