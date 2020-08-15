package com.syntax.repl4;

public class Main8 {
	/*
	 * Overload instance method display by having different types of parameters
	 * Inside each method write the logic to print value of the parameter
	 * 
	 * Call all methods inside your main method
	 */

	Main8(int a) {
		System.out.println(a);
	}

	Main8(String b) {
		System.out.println(b);
	}

	Main8(double c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		Main8 obj1 = new Main8(100);
		Main8 obj2 = new Main8("Syntax Technologies");
		Main8 obj3 = new Main8(100.09);

	}
}
