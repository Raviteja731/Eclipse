package com.xworkz.base.boot;

import com.xworkz.base.DJ;
import com.xworkz.base.Music;

public class DJRunner {

	public static void main(String[] args) {

		DJ dj = new DJ("Raviteja", "MassBand", 25000);
		
		DJ dj2 = new Music("Raviteja", "MassBand", 25000);
		
		Music music = new Music("Raviteja", "MassBand", 25000);
		System.out.println(dj2.bandName);
		System.out.println(dj.djName);
		System.out.println(music.price);
	}

}
