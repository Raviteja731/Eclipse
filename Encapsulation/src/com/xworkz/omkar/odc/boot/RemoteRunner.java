package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Remote;
import com.xworkz.omkar.Tv;

public class RemoteRunner {

	public static void main(String[] args) {

		Remote remote = new Remote();
		Tv tv = new Tv(34, "samsung", 50.9, 30.9, "ravi", "india", 20, 50, "black", true, true, "Remote");
		
		remote.useTv(tv);

		tv.showOff();
		
	}

}
