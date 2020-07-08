package com.syntax.class17;

public class MoreMethods {

	public static void main(String[] args) {
		MoreMethods obj = new MoreMethods();
		int[] array = { 56, 46, 23, 90 };
		int value = obj.largestFromArray(array);
		System.out.println(value);
		String [] words = obj.getWords("Hello World, Good night friends");
		
		for (String newWords:words) {
			System.out.println(newWords);
		}
		System.out.println();
	}

	// create a method that should return the largest number from an array
	int largestFromArray(int[] array) {
		int largest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}
	// create a method that will accept a String and return words from that string
	// Hello World, Good night friends
	
	String [] getWords(String str) {
		return str.split(" ");
		
	}
	
}
