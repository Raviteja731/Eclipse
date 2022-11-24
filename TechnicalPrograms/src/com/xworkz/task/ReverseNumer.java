package com.xworkz.task;

public class ReverseNumer {

public static void main(String...Ra){
		
		int arr[]={1,2,3,4,5,6};
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		
		System.out.println("array in revers order :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+"");
		}
	}
}
