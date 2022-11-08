package com.xworkz.base.boot;

import com.xworkz.base.*;


public class HotelRunner {

	public static void main(String[] args) {

		WeddingInvitation weddingInvitation = new WeddingInvitation("Wedding", 200, 450000);
		Hotel hotel = new Hotel("Akshay-Veg&Non-Veg ", "Chicken", "Hospet");
		
		Hotel hotel2 = new Catering("Akshay-Veg&Non-Veg ", "Chicken", "Hospet");
		
		Catering catering = new Catering("Akshay-Veg&Non-Veg ", "Chicken", "Hospet");
		System.out.println(catering.hotelName);
		System.out.println(catering.location);
		System.out.println(catering.special);
		///System.out.println("===========================================");

		System.out.println("-------invoking invitation properties--------");
		System.out.println("Occasion Name :"+weddingInvitation.occasion);
		System.out.println("noOfCopies :"+weddingInvitation.noOfCopies);
		System.out.println("totalPayment :"+weddingInvitation.totalPayment);
	}

}
