package com.niranjan.ai.session3;

import java.util.Scanner;

/*Design a very basic calculator having features like add, subtract, multiply and division.*/

public class Assignment4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String values = input.nextLine();
		String operation = input.nextLine();
		input.close();
		redirectMethodForOperation(operation,values);
		
	}

	private static void redirectMethodForOperation(String operation,
			String values) {
		switch(operation) {
		case "+":
			System.out.println("Output: " + add(values));
			break;
		case "-":
			System.out.println("Output: " + substract(values));
			break;
		case "*":
			System.out.println("Output: " + multiply(values));
			break;
		case "/":
			System.out.println("Output: " + divide(values));
			break;
		default:
			System.out.println("Output: " + add(values));
			break;				
		}
		
	}

	private static int divide(String values) {
		String[] val = values.split(" ");
		if(Integer.parseInt(val[1]) == 0) {
			System.out.println("Can't divide with 0");
			return -1;
		}
		return Integer.parseInt(val[0]) / Integer.parseInt(val[1]);
	}

	private static int multiply(String values) {
		String[] val = values.split(" ");
		return Integer.parseInt(val[0]) * Integer.parseInt(val[1]);
	}

	private static int substract(String values) {
		String[] val = values.split(" ");
		return Integer.parseInt(val[0]) - Integer.parseInt(val[1]);
	}

	private static int add(String values) {
		String[] val = values.split(" ");
		return Integer.parseInt(val[0]) + Integer.parseInt(val[1]);
	}
}
