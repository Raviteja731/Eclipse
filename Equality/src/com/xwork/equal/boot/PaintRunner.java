package com.xwork.equal.boot;

import com.xwork.equal.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint("Asian", "Blue", 0344, "Arun Paints", "Arun", 370, 50, true, "Powder", 5.3);
		
		Paint paint2 = new Paint("Asia", "Orange", 0, null, null, 0, 0, false, null, 0);
		boolean same = paint.equals(paint2);
		System.out.println(same);
		
		System.out.println(paint.toString());
		System.out.println(paint2.toString());
	}

}
