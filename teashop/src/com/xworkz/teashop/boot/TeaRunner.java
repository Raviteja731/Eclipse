package com.xworkz.teashop.boot;

import com.xworkz.teashop.Tea;

public class TeaRunner {

	public static void main(String[] args) {

	Tea chai = new Tea();
	System.out.println("First Tea MadeBy :"+chai.firstTeaMadeBy);
	System.out.println("Tea Floavor :"+chai.flavor);
	System.out.println("Tea Taste"+chai.taste);
	System.out.println("Teatype :"+chai.teaType);
	System.out.println("Tea Price :-"+chai.price);
	System.out.println("Tasty :"+chai.tasty);
	System.out.println("Brand :"+chai.brand);
	System.out.println("Tea Manuf Company :"+chai.company);
	System.out.println("Tea Types :"+chai.types);
	System.out.println("NoofIngridents :"+chai.noOfIngridents);
	System.out.println("Tea Benfits :"+chai.benifits);
	System.out.println("Tea is Drug :"+chai.drug);
	System.out.println("Tea is Madeby :"+chai.madeBy);
	System.out.println("Is tea good for health :"+chai.goodForHealth);
	System.out.println("Tea Colour :"+chai.colour);
	System.out.println("Highest Tea production country :"+chai.famousTeaProduction);
		
		System.out.println("------updated details------");
	chai.noOfIngridents=5;
	chai.benifits=" Boost Your Immune System";
	chai.drug=false;
	chai.madeBy="Camellia sinensis";
	chai.goodForHealth=true;
	chai.colour="Gold";
	chai.packWeight=5;
	chai.famousTeaProduction="chain";
	System.out.println("First Tea MadeBy :"+chai.firstTeaMadeBy);
	System.out.println("Tea Floavor :"+chai.flavor);
	System.out.println("Tea Taste"+chai.taste);
	System.out.println("Teatype :-"+chai.teaType);
	System.out.println("Tea Price :-"+chai.price);
	System.out.println("Tasty :"+chai.tasty);
	System.out.println("Brand :"+chai.brand);
	System.out.println("Tea Manuf Company :"+chai.company);
	System.out.println("Tea Types :"+chai.types);
	System.out.println("NoofIngridents :"+chai.noOfIngridents);
	System.out.println("Tea Benfits :"+chai.benifits);
	System.out.println("Tea is Drug :"+chai.drug);
	System.out.println("Tea is Madeby :"+chai.madeBy);
	System.out.println("Is tea good for health :"+chai.goodForHealth);
	System.out.println("Tea Colour :"+chai.colour);
	System.out.println("Highest Tea production country :"+chai.famousTeaProduction);
	
		
	}

}
