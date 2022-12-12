package com.xworkz.task.boot;

public class ReverseString {

	public static void main(String[] args) {

		String ref = "Xworkz";
		StringBuilder sb = new StringBuilder(ref);
		sb.reverse();
		System.out.println("original String : "+ref);
		System.out.println(" Reverse String : "+sb);
		
		System.out.println(System.lineSeparator());
		
		
		String rev = "";
		for(int i=ref.length()-1; i>=0;i--)
		{
			rev = rev+ref.charAt(i);
		}
		System.out.println("The reverse String : "+ref );
		System.out.println(rev);
		
		System.out.println(System.lineSeparator());

//		int dist = 0;
//		char str[] = ref.toCharArray();
//		System.out.println("Duplicate haracters in array :"+ref);
//		
//		System.out.println(System.lineSeparator());
//		for(int i=0;i<ref.length(); i++)
//		{
//			for(int j=i+1; j<ref.length();j++)
//			{
//				if(ref.charAt(i)==ref.charAt(j))
//				{
//					dist++;
//				}
//			}
//			System.out.println(ref.charAt(i)+"--"+dist);
//			String d = String.valueOf(ref.charAt(i)).trim();
//			ref=ref.replaceAll(d,"");
//			dist=0;
//		}
//	
//		
		
	}
}
