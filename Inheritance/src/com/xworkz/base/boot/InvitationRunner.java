package com.xworkz.base.boot;

import com.xworkz.base.Invitation;
import com.xworkz.base.WeddingInvitation;

public class InvitationRunner {

	public static void main(String[] args) {

		Invitation invitation = new Invitation("Wedding", 200, 450000);
		
		Invitation invitation2 = new WeddingInvitation("Wedding", 200, 450000);
		WeddingInvitation weddingInvitation = new WeddingInvitation("Wedding", 200, 450000);
		System.out.println("Occasion Name :"+weddingInvitation.occasion);
		System.out.println("noOfCopies :"+weddingInvitation.noOfCopies);
		System.out.println("totalPayment :"+weddingInvitation.totalPayment);
	}

}
