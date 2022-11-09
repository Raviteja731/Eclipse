package com.xworkz.base.boot.boot2;

import com.xworkz.base.base2.Director;
import com.xworkz.base.base2.Prasanth;

public class PrasanthRunner {

	public static void main(String[] args) {

		Prasanth prasanth = new Prasanth("Rajamouli", "Historical", 20);
		
		Director director = new Director("Puri", "Action", 20, 10, 10);
		
		Prasanth prasanth2  = new Director("Puri", "Action", 20, 10, 10);
		director.showOff();
		System.out.println("===================");
		prasanth.display();
	}

}
