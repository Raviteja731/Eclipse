package com.xwork.rules.followers;

public class Management {

	Docter doc;
	public Management(Docter hoRules) {
		this.doc=hoRules;
	}
	
	public void checkHospital()
	{

		if(doc!=null) 
		{
			System.out.println("Null check sucessfully");
			int enty=doc.entryFee();
			boolean good=doc.goodDocters();
			if(enty>10 &&good==true)
			{
				System.out.println("Hospital members  rules  following");
			}
			else {
				System.err.println("Hospital members are not following rules");
			}
		}
	}
	
	
//	boolean followingRules() 
//	{
//		return true;
//	}
//	boolean goodInfrastructure() 
//	{
//		return true;
//	}
	
	
	
}
