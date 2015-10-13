package com.niranjan.ai.session4;

import java.util.Arrays;

public class Assignment2 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,5,5,6,7,8,9,10};
		Arrays.sort(array);
		int index = Arrays.binarySearch(array, 6);
		array = insertElementInArray(array, 6,index+1);
		System.out.println(Arrays.toString(array));
		
	}

	private static int[] insertElementInArray(int[] array,int element, int index) {
		int[] temp = new int[array.length + 1];
		System.arraycopy(array, 0, temp, 0, index);
		temp[index] = element;
		System.arraycopy(array, index, temp, index + 1, array.length - index);
		return temp;
	}
	
}
