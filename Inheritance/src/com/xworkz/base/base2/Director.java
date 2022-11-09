package com.xworkz.base.base2;

public class Director extends Prasanth {

	public int hits;
	public int flops;
	
	public Director(String name, String type, int noOfMovies, int hits, int flops) {
		super(name, type, noOfMovies);
		this.hits = hits;
		this.flops = flops;
	}
	public void showOff()
	{
		super.display();
		System.out.println(this.hits);
		System.out.println(this.flops);
	}
	
	

	
}




