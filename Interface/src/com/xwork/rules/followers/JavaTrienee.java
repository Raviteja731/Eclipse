package com.xwork.rules.followers;

import com.xwork.rules.XworkRules;

public class JavaTrienee extends person implements XworkRules {

	public person per;
	
	
	public JavaTrienee(String name, int age, String gender, String nativee, String qualifaction) {
		super(name, age, gender, nativee, qualifaction);
	}
	
	

	@Override
	public boolean uploadedTask() {
			System.out.println("Running uploadedTask Method");		
				return false;
	}

	@Override
	public boolean completingTask() {
		System.out.println("Running completingTask Method");		
		return false;
	}

	public void checking() 
	{
		if(per!= null) 
		{
			System.out.println("Running Checking method");
			boolean pr =per.eat();
			boolean pro=per.sleep();
			if(pr==true && pro==true) 
			{
				System.out.println("Person is alive");
			}
			else {
				System.out.println("person is not alive");
			}
		}
	}
	
}
