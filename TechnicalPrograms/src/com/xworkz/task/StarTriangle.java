package com.xworkz.task;

public class StarTriangle {

	public static void main(String[] args) {

		for (int i = 1; i<=6; i++) 
		{
			for (int j = 1; j<=i; j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		System.out.println("Printing Triangle ");
		

		for (int i = 1; i<=6; i++) 
		{
			for (int j = 1; j<=i; j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("Printing reverse triangle ");
	
		for (int i = 1; i<=6; i++) 
		{
			for (int j = i; j<=6; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}

		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("Printing right side triangle");
			int n = 6;
		
		for (int i = 1; i<=n; i++) 
		{
			for (int j = n-1; j>=i; j--) 
			{
				System.out.print("-");
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print("R");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("==========================");
		System.out.println("Printing reverse left side trianle");
		
		for (int i = n; i>=1; i--) 
		{
			for (int j = n-1; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print("R");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		System.out.println("Printing triangle ");
		
		for (int i = 1; i<=n; i++) 
		{
			for (int j = n-1; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("==============================");
		System.out.println("Printing triangle number ");
		for (int i = 1; i<=n; i++) 
		{
			for (int j = n-1; j>=i; j--) 
			{
				System.out.print(" ");			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("===================================");
		System.out.println("Printing character in square");
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = n-1; j >=i; j--) 
			{
				if(j==2)
				{
					System.out.print("R");
				}
				else 
				{
					System.out.print(j);
				}
				for (int k = 1; k <=i; k++) 
				{
					if(k==2) 
					{
						System.out.print("R");
					}
					else 
					{
						System.out.print(k);
					}
				}
			}
			System.out.println("");
		}
		
		System.out.println("===========================");
		System.out.println("Printing reverse triangle ");
		
		for (int i = n; i<=1; i--) 
		{
			for (int j = n-1; j>=i; j--) 
			{
				System.out.print(j);			}
			for (int k = i; k >=1; k--) 
			{
				System.out.print("R ");
			}
			System.out.println(" ");
		}
		
	}
}
