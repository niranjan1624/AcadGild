package com.niranjan.ai.session2;

import java.util.Scanner;

/*Write a program to print total number of days in the given month

This assignment will help you to master the following concepts:
switch statements*/

public class Assignment4 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		input.close();
		switch(month) {
		case 1:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 3:
			System.out.println(31);
			break;
		case 4:
			System.out.println(30);
			break;
		case 5:
			System.out.println(31);
			break;
		case 6:
			System.out.println(30);
			break;
		case 7:
			System.out.println(31);
			break;
		case 8:
			System.out.println(31);
			break;
		case 9:
			System.out.println(30);
			break;
		case 10:
			System.out.println(31);
			break;
		case 11:
			System.out.println(30);
			break;
		case 12:
			System.out.println(31);
			break;
		default:
			System.out.println("Please enter a valid month");
			break;
				
		}
	}
}
