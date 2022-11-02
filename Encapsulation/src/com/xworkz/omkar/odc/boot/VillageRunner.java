package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Taluk;
import com.xworkz.omkar.Village;

public class VillageRunner {

	public static void main(String[] args) {

		Taluk taluk = new Taluk();
		Village village = new Village();
		taluk.getName();
		village.useTaluk(taluk);
		
	}

}
