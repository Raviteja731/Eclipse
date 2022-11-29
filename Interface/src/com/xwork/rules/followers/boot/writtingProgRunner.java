package com.xwork.rules.followers.boot;

import com.xwork.rules.writtingProg;
import com.xwork.rules.followers.Program;

public class writtingProgRunner {

	public static void main(String[] args) {

		Object obj = new Program();
		
		Program pro = new Program();
		
		writtingProg wri = new Program();
		
		System.out.println(pro.classes());
		System.out.println(pro.correctSpellings());
		System.out.println(pro.software());
		System.out.println(pro.standards());
		System.out.println(pro.startwithcaps());
	}

}
