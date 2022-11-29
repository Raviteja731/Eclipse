package com.xworkz.task;

public class Rice extends Wheet {

	public String water;
	public static int price;
	Rice ric;
	
	public Rice(String colour, int months, String owner, String soli) {
		super(colour, months, owner, soli);
	}
	
	@Override
	public Rice sweet(int price) 
	{
	Wheet wheet = new Wheet("gold", 10, "Karthi", "Black");
		wheet.sweet();
		
		return ric;
		
	}
	public void dispay()
	{
	 super.showOff();
	 System.out.println(this.water);
	 System.out.println(this.price);
	 
		
	}
	
	
}
