package com.niranjan.ai.session3;

import java.util.*;

/*Write a java program which generates a random number such that 0 <= Random Number <= N-
1 * where N is a given input number.
*/

public class Assignment3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		in.close();
		int randomVal = generateRandom(val);
		System.out.println("Random value is: " + randomVal);
	}

	private static int generateRandom(int val) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		return random.nextInt(val);
	}
}
