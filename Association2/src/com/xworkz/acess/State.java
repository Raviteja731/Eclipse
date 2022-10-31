package com.xworkz.acess;

public class State {

	public String state;
	public String captial;
	public int stateNumber;
	public String cmName;
	
	public State(String state, String captial, int stateNumber, String cmName) {
		this.state = state;
		this.captial = captial;
		this.stateNumber = stateNumber;
		this.cmName = cmName;
	}
	public void showOff()
	{
		System.out.println("=====Showing state Details=====");
		System.out.println("State Name :"+this.state);
		System.out.println("Captial City :"+this.captial);
		System.out.println("CM Name   :"+this.cmName);
		System.out.println("State Number :"+this.stateNumber);
		
	}
	
}
