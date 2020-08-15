package com.syntax.repl5;

public class Main4 extends Parent {

	void m1() {
		System.out.println("m1 without parameters");
	}
	void m1(int x) {
		System.out.println("m1 with parameter");
	}
	public static void main(String[] args) {
		Main4 obj = new Main4();
		obj.m1();
		obj.m1(10);
	}
}
