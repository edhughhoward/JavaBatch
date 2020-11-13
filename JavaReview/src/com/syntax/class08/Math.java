package com.syntax.class08;

public class Math {

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	protected static int multiply(int num1, int num2) {
		return num1*num2;
	}
	static int subtract(int num1, int num2) {
		return num1-num2;
	}
	private static int divide(int num1, int num2) {
		if (num2==0) {
		return -1;	
		}
		return num1/num2;
		
	}
	public static void main(String [] args) {
		int result1;
		int result;
		result1 = add(4,7);
		result = multiply(3,5);
	}
}
