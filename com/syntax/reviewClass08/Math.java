package com.syntax.reviewClass08;

public class Math {

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	protected static int multiply(int num3, int num4) {
		return num3*num4;
	}
	static int sub(int one, int two) {
		return one-two;
	}
	private static int divide(int a, int b) {
		if (b==0){
		return -1;
	}
	return a/b;
	}
	
	public static void main(String[] args) {
		
		int result = 0;
		
		result = add(4,7); //outside the class you have to type math.add
		System.out.println("addition result: " + result);
		
		result = multiply(4,6);
		System.out.println("Multiplication result: " + result);
		
		result = sub(6,10);
		System.out.println("Subtraction result: " + result);
		
		result = divide(6,3);
		System.out.println("division result: " + result);
	}
}
