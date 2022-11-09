package com.xworkz.base.base2;

public class BJP extends PoliticalParty {

	public  int founded;
	public String colour;
	
	public BJP(String partyName, String partyLeader, int since, int founded, String colour) {
		super(partyName, partyLeader, since);
		this.founded = founded;
		this.colour = colour;
	}

	public void display()
	{
		super.display();
		System.out.println(this.colour);
		System.out.println(this.founded);
	}
	
	
	
	
}
