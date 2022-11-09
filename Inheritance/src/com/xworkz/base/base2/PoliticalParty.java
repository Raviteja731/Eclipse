package com.xworkz.base.base2;

public class PoliticalParty {

	public String partyName;
	public String partyLeader;
	public int since;
	
	public PoliticalParty(String partyName, String partyLeader, int since) {
		this.partyName = partyName;
		this.partyLeader = partyLeader;
		this.since = since;
	}
	public void  display()
	{
		System.out.println(this.partyName);
		System.out.println(this.partyLeader);
		System.out.println(this.since);
		
	}
	
}
