package com.xworkz.constants.oct20.boot;
import com.xworkz.constants.oct20.XWorkZ;

public class XWorkZRunner {

	public static void main(String[] args) {
		String[] staff= {"Omkar","All OK","Vinay","Lokesh","Dev","Vinoda"};
		
		XWorkZ xWorkZ=new XWorkZ("Omkar Development Center","Omkar", 123, 245, 566, "Omkar",123, 45);
				xWorkZ.displayDetails();

	}

}
