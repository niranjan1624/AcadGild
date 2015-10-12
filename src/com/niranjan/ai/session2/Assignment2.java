package com.niranjan.ai.session2;

/*Generate prime numbers between 1 and 100 using for loop. A prime number (or a prime) is a
natural number greater than 1 that has no positive divisors other than 1 and itself. A natural
number greater than 1 that is not a prime number is called a composite number. Use for loop
and break statement to achieve this task. */

public class Assignment2 {
	
	public static void main(String[] args) {
		boolean prime;
		for(int i = 2; i <= 100; i++) {
			prime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i %j == 0) {
					prime = false;
					break;
				}
			}
			if(prime)
				System.out.print(i + " ");
		}
	}

}
