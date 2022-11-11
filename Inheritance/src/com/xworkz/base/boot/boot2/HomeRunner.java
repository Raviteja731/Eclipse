package com.xworkz.base.boot.boot2;

import com.xworkz.base.base2.Home;
import com.xworkz.base.base2.Pg;

public class HomeRunner {

	public static void main(String[] args) {

		Pg pg = new Pg();
		Home home = new Home();
		
		home.display();
		pg.display();
	}

}
