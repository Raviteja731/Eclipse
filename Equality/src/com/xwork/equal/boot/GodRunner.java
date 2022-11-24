package com.xwork.equal.boot;

import com.xwork.equal.God;

public class GodRunner {

	public static void main(String[] args) {

		God god = new God("Ganesh", "Siddhi", "Axe", "Mushika", false, 0, "Shiva", "Parvathi", 100, true);
		
		God god2 = new God("Hanuman", "Revathi", "Gadha", "Air", false, 0, "Vayudeava", "Anjanadhri", 200, true);
		boolean same = god.equals(god2);
		System.out.println(same);
		
		System.out.println(god.toString());
		System.out.println(god2.toString());
	}

}
