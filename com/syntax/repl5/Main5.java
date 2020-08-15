package com.syntax.repl5;

public class Main5 extends Parent2 {
public void m1() {
			System.out.println("Child class providing implementation");
		}	/*
	 * Create a Parent Class in which you will have 
	 * 1 implemented method m2
	 * 1 unimplemented method m1
	 * 
	 * Make Main class to be a derived class from Parent.
	 * 
	 * In main method execute both methods
	 */

	// Child class providing implementation
	// Parent class providing implementation
	
	public static void main(String[] args) {
		Parent2 obj = new Main5();
		obj.m1();
		obj.m2();
	}
}
