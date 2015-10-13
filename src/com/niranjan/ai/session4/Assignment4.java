package com.niranjan.ai.session4;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:  ");
		String value = input.nextLine();
		input.close();
		printReversedString(value);

	}

	private static void printReversedString(String value) {
		String result = "";
		for(int i = value.length() - 1; i >= 0; i--) {
			result = result + value.charAt(i);
		}
		System.out.println("Given String: " + value);
		System.out.println("Reversed String: "  + result);
	}

}
