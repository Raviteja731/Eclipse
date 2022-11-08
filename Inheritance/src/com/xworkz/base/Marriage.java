package com.xworkz.base;

public class Marriage {

	public String bidegroom;
	public String bride;
	public String location;
	
	public Marriage() {
		System.out.println("default marriage constructor created");
	}

	public Marriage(String bidegroom, String bride, String location) {
		this.bidegroom = bidegroom;
		this.bride = bride;
		this.location = location;
	}



	
}
