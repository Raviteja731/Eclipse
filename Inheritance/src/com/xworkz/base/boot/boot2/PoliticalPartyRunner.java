package com.xworkz.base.boot.boot2;

import com.xworkz.base.base2.BJP;
import com.xworkz.base.base2.PoliticalParty;

public class PoliticalPartyRunner {

	public static void main(String[] args) {

		BJP bjp = new BJP("BJP", "Modhi", 1980, 0, null);
		
		PoliticalParty polParty = new PoliticalParty("BJP", "Modhi", 1980);
		
		BJP bjp2 = new BJP("BJP", "Modhi", 1980, 0, null);
		
		bjp.display();
		
		
		
	}

}
