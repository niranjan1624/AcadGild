package com.niranjan.ai.session2;

import java.util.Scanner;

/*Write a Java program to allow the user to input his/her age. Then the program has to show
whether the person is eligible to vote or not.*/
public class Assignment1 {
	
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		Scanner input = new Scanner(System.in);
		age = input.nextInt();
		if(age >= 18)
			System.out.println("you are eligible to vote");
		else
			System.out.println("you are not eligible to vote");
		input.close();
	}
	
}
