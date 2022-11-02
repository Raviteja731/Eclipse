package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Patas;
import com.xworkz.omkar.Temper;

public class PatasRunner {

	public static void main(String[] args) {

		Temper temper = new Temper();
		
		Patas patas = new Patas();
		
		temper.getName();
		patas.useTemper(temper);
	}

}
