package com.syntax.repl4;

public class Main7 {

	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public void subtraction(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	public void subtraction(int a, int b, int c, int d) {
		System.out.println(a - b - c - d);

	}

	public static void main(String[] args) {

		Main7 obj = new Main7();
		obj.subtraction(80, 20, 10, 10);
		obj.subtraction(60, 20, 10);
		obj.subtraction(40, 20);
	}

}
