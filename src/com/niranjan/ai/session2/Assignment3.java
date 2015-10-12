package com.niranjan.ai.session2;

/*1Write a code using loops to print following pattern.
1
12
123
1234
12345
1234
123
12
1*/

public class Assignment3 {
	
	public static void main(String[] args) {
		int temp = 0;
		for(int i = 1; i < 10; i++) {
			if(i <=5) 
				temp = temp * 10 + i;
			else
				temp = temp/10;
			System.out.println(temp);
				
				
		}
	}
}
