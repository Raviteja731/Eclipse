package com.xworkz.task.boot;

public class StringSplit {

	public static void main(String[] args) {


		String ref = "Hello Buddy";
		String[] ref1;
		String temp = " ";
		ref1 = ref.split(temp);
		for(int i=0;i<ref1.length;i++)
		{
			System.out.println("Split :"+ref1[i]);
			System.out.print("");
			
		}

}
}
