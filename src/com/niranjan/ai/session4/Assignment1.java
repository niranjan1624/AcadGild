package com.niranjan.ai.session4;
/*Print reverse of an array*/
public class Assignment1 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		printReverseArray(array);
	}

	private static void printReverseArray(int[] array) {
		int len = array.length;
		for(int i = len - 1; i >= 0; i--) 
			System.out.print(array[i] + " ");
	}
	
}
