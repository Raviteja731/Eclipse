package com.xworkz.task.boot;

public class Amstrong {

	public static void main(String[] args) {

		int n=153;
		int rem=1, temp=n;
		int sum=0;
		int origin=n;
		int store=0;
		int count=0;
		while(n>0)
		{
			rem=n%10;
			count++;
			n=n/10;
				
		}
		while(count>0)
		{
			rem=temp%10;
			store=rem*count;
			
			
		}
		
		System.out.println("remder"+store);
		if(origin==sum) {
		System.out.println("armstrong number is"+sum);
		}
		else
		{
			System.out.println(" is not armstrong number is"+sum);

		}
	
	

}
}
