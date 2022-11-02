package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.God;
import com.xworkz.omkar.Godeses;

public class GodesesRunner {

	public static void main(String[] args) {

		God god = new God("Male", "Trishul", "Paravathi", "Nandhi", "Ram", "Manjunath", "SriShaliam", 10, true,false);
		Godeses godeses = new Godeses();
			godeses.useGod(god);
			god.showOff();
				
	}

}
