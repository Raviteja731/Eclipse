package com.xwork.equal;

public class TrippleRideRunner {

	public static void main(String[] args) {

		String ref = "Triple Riding is a Kannada movie released on 25 Nov, 2022. "
				+ "The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, "
				+ "Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println(ref);
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("=====> ref is Converting into UpperCase <=======");
		String ref1 = ref.toUpperCase();
		System.out.println(ref1);
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("=====> ref is Converting into LowerCase <=======");
		String ref2 = ref.toLowerCase();
		System.out.println(ref2);
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("=====> Checking ref length <=======");
		System.out.println("Length :"+ref.length());
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("=====> Spliting the ref <=======");
		String[] splitstament = ref.split(",");
		for (int i = 0; i < splitstament.length; i++) {
			System.out.println(splitstament[i]);
		}
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("=====> Converting ref into Char[] <=======");
		char[] array = ref.toCharArray();
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("=====>  Reversing the ref <=======");
		for (int i = array.length - 1; i >= 0; i--) 
		{
			System.out.print(array[i]);

		}
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("---------------------------------------------------");
		System.out.println("=====> Checking palindrom <=====");		
		String reveStr= "";
		for(int i=ref.length()-1; i>=0;i--)
		{
			reveStr = reveStr+ ref.charAt(i);
		}
		if (ref.equals(reveStr)) {
			System.out.println(ref + "It is Palindrom");
		} else {
			System.out.println("String :"+ref +"====> It is not Palindrom <=========");
		}
		System.out.println("---------------------------------------------------");
		System.lineSeparator();
		
		System.out.println("=====> Finding R word <=====");		
		char word = 'R';
		    int freq = 0;
		   for(int i=0;i< ref.length();i++)
		   {
			   if(word == ref.charAt(i))
			   {
				   ++freq;
			   }
		   }
		   System.out.println("No Of R's is :"+word+"="+freq);
		   System.lineSeparator();
			System.out.println("---------------------------------------------------");

			System.out.println("=====> Finding Duplicates in ref <=====");		
			char[] duplicate = ref2.toCharArray();
			int[] dup = new int[duplicate.length];
			for (int i = 0; i < duplicate.length; i++) {
				dup[i] = 1;
				for (int j = i + 1; j < duplicate.length; j++) {
					if (duplicate[i] == duplicate[j]) {
						dup[i]++;
						duplicate[j] = 0;
					}
				}
			}
			for (int i = 0; i < dup.length; i++) {
				if (duplicate[i] != ' ' && duplicate[i] != 0) {
					System.out.println(duplicate[i] + "-" + dup[i]);
				}
			}
	}

}
