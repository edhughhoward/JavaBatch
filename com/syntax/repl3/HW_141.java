package com.syntax.repl3;

public class HW_141 
{
public static void main(String[] args) {
		int[] arr = { 5, 12, -3, 7, 3, 22 };
		System.out.println(maxValue(arr)); // should print 22
	}	/*
	 * Create the maxValue method that will accept int array and return return the
	 * maximum value in the array.
	 * 
	 * Method should visible every class in any package!
	 * 
	 * Expected Output: 22
	 */

	public static int maxValue(int[] arr) {
		int biggest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (biggest < arr[i]) {
				biggest = arr[i];
			}
			return biggest;
		}
	}
	}

	

