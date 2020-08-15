package com.syntax.repl4;

public class Main10 {
	/* Overload static method and then execute both overloaded methods. */

	static void m1() {
		System.out.println("static method without parameter");
	}

	static void m1(int a) {
		System.out.println("static method with int parameter");
	}

	public static void main(String[] args) {
		m1();
		m1(1);
	}
}
