package com.syntax.repl5;

public class Main8 {

	public void parentMethod() {
		System.out.println("Parent Method-welcome to Syntax");
	}

	public void childMethod() {
		System.out.println("Child Method-hello Syntax");
	}

	public static void main(String[] args) {
		Main8 obj = new Main8();
		obj.parentMethod();
		obj.childMethod();
	}
}
