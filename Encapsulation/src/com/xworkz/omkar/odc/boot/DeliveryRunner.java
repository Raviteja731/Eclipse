package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Delivery;
import com.xworkz.omkar.Flipkart;

public class DeliveryRunner {

	public static void main(String[] args) {

		Delivery delivery = new Delivery();
		Flipkart flipkart = new Flipkart("Sachin Bansal", "Banglore", 2008, 30000, 10, 43615, 234588, 5670, 4670, 470);
		delivery.useCompanyName(flipkart);
		flipkart.getCompanyName();
		flipkart.showOff();
	}

}
