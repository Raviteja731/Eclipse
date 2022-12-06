package com.xworkz.task.boot;

public class Fibanaci {

	public static void main(String[] args) {

		int n=0,n1=1,n3;
		System.out.println(n+""+n1);
		for(int i=0;i<5;i++)
		{
			n3=n+n1;
			System.out.println(n3);
			n=n1;
			n1=n3;
		}
			
		
	}

}
