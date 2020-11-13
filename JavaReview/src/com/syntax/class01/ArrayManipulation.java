package com.syntax.class01;

public class ArrayManipulation {

	public int largest(int[] array) {
		int max = array[0];
		
		for(int i =1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
			
		return max;
	}
}
