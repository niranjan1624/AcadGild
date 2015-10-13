package com.niranjan.ai.session1;

public class Assignments {
	
	public static void main(String[] args) {
		// Assignment 1;
		int i = 10;
		float f = (float) 10.1;
		int output = i + (int)f;
		System.out.println("Addition: " + output);
		
		//Assignment 2
		int a, b = 4, c;
		
		//Assignment 3
	  /*  Examples of data that can't be stored in int --> String, boolean
		int x = true;
		int y ="string";*/
		
		// Assignment 4
		
		int x = 5;
		int y = 10;
		
		System.out.println("a. x + y * 2 = " + ( x + y * 2));
		System.out.println("b. x - y + 2 = " + ( x - y + 2));
		System.out.println("c. (x + y) * 2 = " + (( x + y) * 2));
		System.out.println("d. y % x = " + ( y % x));
		
		String str = "niranjan";
		String str1 = "niranjan1";
		String str2 = str1;
		String str3 = new String("niranjan");
		if(str.equals(str1))
			System.out.println("str = str1");
		if(str2.equals(str1))
			System.out.println("str2 = str1");
		if(str3.equals(str1))
			System.out.println("str3 = str1");
		
		
	}
}
