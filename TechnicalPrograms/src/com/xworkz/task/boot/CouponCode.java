package com.xworkz.task.boot;

import java.util.Scanner;

public class CouponCode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String coupon = scan.next();
		
		String str1 = coupon.substring(0,2);
		System.out.println(str1);
		String str2 = coupon.substring(2,6);
		System.out.println(str2);
		String str3 = coupon.substring(3,4);
		System.out.println(str3);
		
		int convertString = Integer.valueOf(str2);
		System.out.println(convertString);
		
		String ref = String.valueOf(str2);	
		
		if(coupon.length()==8 && convertString==2021)
		{
			System.out.println("valid coupon "+coupon);
		}else {
			System.out.println("Invalid coupon "+coupon);

		}
	}

}
