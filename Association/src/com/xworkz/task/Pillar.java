package com.xworkz.task;

import com.xworkz.task.things.Shape;

public class Pillar {

	/* id,place,shape:enum,height,supporting,company:custom
showOff()
Company: name,type,showOff() */
	
	public int id;
	public Shape shape = Shape.CIRCLE;
	public int height;
	public String supporting;
	public Company company= new Company ("Vinoda","ITBT");
	
	public Pillar()
	{
		
	}
	public Pillar(int id, int height, String supporting) {
		this.id = id;
		this.height = height;
		this.supporting = supporting;
	}
	public void showOff()
	{
		
		System.out.println("Pillar id :"+this.id);
		System.out.println("Pillar height :"+this.height);
		System.out.println("Pillar supports :"+this.supporting);
		
	}
}
