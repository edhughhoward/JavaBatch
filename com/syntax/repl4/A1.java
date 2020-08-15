package com.syntax.repl4;

public class A1 {
	/*
	 * 1. Create Three classes (Main, A, B):
	 * 
	 * Have a method that prints out the following For A: "Class A" For B: "Class B"
	 * 
	 * Make B extend A
	 * 
	 * From your Main class create an object of the B class and call the methods.
	 */
	public void example1() {
		System.out.println("Class A");
	}

}

class b extends A1 {

	public void example2() {
		System.out.println("Class B");

	}
}