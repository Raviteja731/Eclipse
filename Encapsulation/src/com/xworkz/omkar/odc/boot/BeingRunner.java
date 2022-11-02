package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Being;
import com.xworkz.omkar.Human;

public class BeingRunner {

	public static void main(String[] args) {

		Human human = new Human("Black", 2, 2, 2, 10, 31, 2, true, 6, 60);
		Being being = new Being();
		human.getName();
		human.showOff();
		being.useHuman(human);
	}

}
