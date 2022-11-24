package com.xworkz.task.boot;

public class Add {

	public static void main(String[] args) {
		add(444, 5);
		sub(995,5);

	}

	public static int add(int a, int b) {
		int sum = a ^ b;
		int carry = a & b;
		while (carry != 0) {
			carry <<= 1;
			a = sum;
			b = carry;
			sum = a ^ b;
			carry = a & b;
		}
		System.out.println(sum);
		return sum;
	}
	
	public static int sub(int a, int b) {
		int sub=a+(~b+1);
		System.out.println(sub);
		return sub;
		
		
	}
}
