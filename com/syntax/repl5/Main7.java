package com.syntax.repl5;

public class Main7 implements FirstInterface, SecondInterface {

	public void firstMethod() {
		System.out.println("First Method implementing multiple Inheritance");
	}

	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance");
	}

	public static void main(String[] args) {
		Main7 obj = new Main7();

		obj.firstMethod();
		obj.secondMethod();
	}

}
