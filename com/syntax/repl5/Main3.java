package com.syntax.repl5;

public class Main3 {
	/*
	 * Overload 2 final instance methods:
	 * 
	 * Call them in main method
	 * 
	 * Expected Output: Final method with boolean parameter Final method with String
	 * parameter
	 */
	final void method1(boolean a) {
		System.out.println("Final method with boolean parameter");

	}

	final void method2(String b) {
		System.out.println("Final method with String parameter");
	}

	public static void main(String[] args) {
		Main3 obj = new Main3();
		obj.method1(true);
		obj.method2("true");
	}
}
