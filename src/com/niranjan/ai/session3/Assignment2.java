package com.niranjan.ai.session3;

import java.util.Scanner;

/*Write a simple Java program to check whether a given number is a prime number or not.
 */

public class Assignment2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		in.close();
		//System.out.println(val+" : " + );
		isPrime(val);
	}

	private static boolean isPrime(int val) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= val/2; i++) {
			if(val % i == 0) {
				System.out.println(val + " is not a prime ");
				return false;
			}
		}
		System.out.println(val + " is a prime ");
		return true;
	}

}
