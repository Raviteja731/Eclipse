package com.xworkz.omkar;

public class Districts {

	public State state;
	
	public void useState(State state)
	{
		System.out.println(state.getName());
		state.setName("Karnataka");
		System.out.println("after updating :"+state.getName());
		
	}
}
