package com.xworkz.task.boot;

public class Count {
	public static void main(String[] args) {

int count = 0;


	String name = "t h y j f";

System.out.println(name.replaceAll("\\s", ""));
//		for(int i=0;i<name.length();i++)
//		{
//			 if(name.charAt(i)==' ')
//			 {
//				 count++;
//			 }
//		}
//		System.out.println("count :"+count);
//		
//		System.out.println(System.lineSeparator());
		char na =' '; 
		for (int i=0;i<name.length();i++)
			
		{
			if(name.charAt(i)!=' ')
			{
				
				na=name.charAt(i);
			}
		}
	
		System.out.println("count :"+na);
	}
	

}
