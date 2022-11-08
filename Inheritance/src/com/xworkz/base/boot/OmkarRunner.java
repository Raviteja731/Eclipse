package com.xworkz.base.boot;

import com.xworkz.base.Dowry;
import com.xworkz.base.Omkar;

public class OmkarRunner {

	public static void main(String[] args) {

		Omkar omkar = new Omkar(1000000, "Mamatha",true);
		
		Omkar omkar2 = new Dowry(1000000, "Mamatha",true);
		
		Dowry dowry = new Dowry(1000000, "Mamatha",true);
		System.out.println(omkar.amount);
		System.out.println(omkar.Bride);
		System.out.println(omkar.happy);
	}

}
