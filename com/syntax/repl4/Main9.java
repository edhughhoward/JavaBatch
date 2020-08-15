package com.syntax.repl4;

public class Main {
	/*
	 * Overload private instance method m1
	 * 
	 * Call each method from the main method.
	 * 
	 * Expected Output: private m1 method private m1 method with int parameter
	 */
	private Main() {
		System.out.println("private m1 method");
	}

	private Main(int a) {
		System.out.println("private m1 method with int parameter");
	}

	public static void main(String[] args) {
		Main obj1 = new Main();
		Main obj2 = new Main(1);
	}
}
