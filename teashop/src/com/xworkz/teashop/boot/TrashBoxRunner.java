package com.xworkz.teashop.boot;

import com.xworkz.teashop.TrashBox;

public class TrashBoxRunner {

	public static void main(String[] args) {

	TrashBox dustbin = new TrashBox();
		System.out.println(dustbin.tyres);
		System.out.println(dustbin.price);
		System.out.println(dustbin.height);
		System.out.println(dustbin.shape);
		System.out.println(dustbin.use);
		System.out.println(dustbin.colour);
		System.out.println(dustbin.material);
		System.out.println(dustbin.brand);
		System.out.println(dustbin.manufDate);
		System.out.println(dustbin.strength);
		System.out.println(dustbin.capacity);
		System.out.println(dustbin.holder);
		System.out.println(dustbin.weight);
		System.out.println(dustbin.fireProof);
		System.out.println(dustbin.waterProof);
		System.out.println(dustbin.thickness);
		System.out.println(dustbin.reUseable);
		System.out.println(dustbin.handling);
		
		System.out.println("------updated details------");
	dustbin.brand="Rolex";
	dustbin.height=15;
	dustbin.shape="Long cylinder";
	dustbin.use="Medical Waste";
	dustbin.strength=1;
	dustbin.holder=true;
	dustbin.waterProof=true;
	dustbin.thickness=2.2;
	dustbin.reUseable=true;
	dustbin.handling="manual";
	System.out.println("TrashBox Has Tyres :"+dustbin.tyres);
	System.out.println("Price :"+dustbin.price);
	System.out.println("Height :"+dustbin.height);
	System.out.println("Shape :"+dustbin.shape);
	System.out.println("Use :"+dustbin.use);
	System.out.println("Colour :"+dustbin.colour);
	System.out.println("Material :"+dustbin.material);
	System.out.println("Brand :"+dustbin.brand);
	System.out.println("ManufMonth :"+dustbin.manufDate);
	System.out.println("Strength :"+dustbin.strength);
	System.out.println("Capacity :"+dustbin.capacity);
	System.out.println("TashBox has holder :"+dustbin.holder);
	System.out.println("Weight :"+dustbin.weight);
	System.out.println("TrashBox Fireproof :"+dustbin.fireProof);
	System.out.println("TrashBox Waterproof :"+dustbin.waterProof);
	System.out.println("Thickness :"+dustbin.thickness);
	System.out.println("Reusable :"+dustbin.reUseable);
	System.out.println("Handling :"+dustbin.handling);
	}

}
