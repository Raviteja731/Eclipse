package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Africa;
import com.xworkz.omkar.Kangaroo;

public class KangarooRunner {

	public static void main(String[] args) {

		Africa africa = new Africa();
		Kangaroo kangaroo = new Kangaroo();
		kangaroo.useAfrica(africa);
		africa.getAreaInSquareKms();
	}

}
