package com.xworkz.items.boot;
import com.xworkz.items.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {

		DistrictCollector collector1 = new DistrictCollector();
		System.out.println("collector Name :"+collector1.name);
		System.out.println("collector Age :"+collector1.age);
		System.out.println("District :"+collector1.district);
		System.out.println("Batch No :"+collector1.batchNo);
		
		System.out.println("------Updated Details------");
		collector1.name="Surya";
		collector1.age=29;
		collector1.district="Bellary";
		collector1.batchNo=06;
		System.out.println("collector Name :"+collector1.name);
		System.out.println("collector Age :"+collector1.age);
		System.out.println("District :"+collector1.district);
		System.out.println("Batch No :"+collector1.batchNo);
	}

}
