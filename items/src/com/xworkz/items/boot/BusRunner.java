package com.xworkz.items.boot;
import com.xworkz.items.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus vechical1=new Bus();
		System.out.println(vechical1.number);//0
		System.out.println(vechical1.starting);//null
		System.out.println(vechical1.destination);//null
		
		
		vechical1.number=34;
		vechical1.starting="Hell";
		vechical1.destination="Heavan";
		System.out.println("vechical Number :"+vechical1.number);//34
		System.out.println("Journy starts from :"+vechical1.starting);//hell
		System.out.println("Journy destination :"+vechical1.destination);//Heaven
		
	System.out.println("------Updated Bus Details------");
		vechical1.number=35;
		vechical1.starting="kashmir";
		vechical1.destination="kanyakumari";
		System.out.println("vechical Number :"+vechical1.number);//35
		System.out.println("Journy starts from :"+vechical1.starting);//kashmir
		System.out.println("Journy destination :"+vechical1.destination);//kanyakumari
	}

}
