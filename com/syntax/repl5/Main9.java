package com.syntax.repl5;

public class Main9 implements Functions {

	public void display(double result) {
		System.out.println("Result is ::: " + result);
	}

	public double adding(double num1, double num2) {
		return num1 + num2;
	}

	public double subtracting(double num1, double num2) {
		return num1 - num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double dividing(double num1, double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		double num1 = 100;
		double num2 = 20;
		double result;

		Main9 obj = new Main9();
		result = obj.adding(num1, num2);
		obj.display(result);

		result = obj.subtracting(num1, num2);
		obj.display(result);

		result = obj.multiply(num1, num2);
		obj.display(result);

		result = obj.dividing(num1, num2);
		obj.display(result);
	}
}
