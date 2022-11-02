package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Districts;
import com.xworkz.omkar.State;

public class DistrictsRunner {

	public static void main(String[] args) {

		State state = new State();
		Districts district = new Districts();
		district.useState(state);
		state.getName();
	}

}
