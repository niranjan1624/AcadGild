package com.niranjan.ai.session3;


/*To calculate square root and cube root of a number in Java. Use Math class and its static
method sqrt(...) & cbrt(...).*/
public class Assignment1 {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		printSquareRootCubeRoot(num);
	}
	public static void printSquareRootCubeRoot(int num) {
		System.out.println("Square root of given number: " + Math.sqrt(num));
		System.out.println("Square root of given number: " + Math.cbrt(num));
	}
}
