package com.syntax.class17;

public class MethodsWithReturn {

	public static void main(String[] args) {
		MethodsWithReturn obj = new MethodsWithReturn();
		boolean obj2 = obj.isEven(12);
		System.out.println(obj2);
		String newObject = obj.convertToUpperCase("elephant");
		System.out.println(newObject);

	}
// create a method that will accept int value and return if the number is even. 

	boolean isEven(int a) {
		boolean even;

		if (a % 2 == 0) {
			even = true;
		} else {
			even = false;
		}
		return even;
	}
	// create a methods that will accept 2 int values and return the largest

	int getLargest(int a, int b) {
		int largest;

		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;// return value must be same type as "return"
	}

	String convertToUpperCase(String string1) {
		return string1.toUpperCase();
	}

}
