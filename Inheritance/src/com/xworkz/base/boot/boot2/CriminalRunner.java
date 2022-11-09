package com.xworkz.base.boot.boot2;

import com.xworkz.base.base2.Criminal;
import com.xworkz.base.base2.Ravi;

public class CriminalRunner {

	public static void main(String[] args) {

		Criminal criminal = new Criminal("Murder", 420, "Karthi", 25);
		
		Ravi ravi = new Ravi("Murder", 420, "Arun", 25, true, true);
		
		Criminal criminal2 = new Ravi("Wheeling", 420, "Prashant", 25, true, true);
		
		ravi.display();
		System.out.println("==============");
		criminal.display();
	}

}
