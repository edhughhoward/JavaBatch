package com.syntax.repl5;

class Main6 implements MyInterface{
	
	public void method1() {
		System.out.println("implementation of method1");
	}
	public void method2() {
		System.out.println("implementation of method2");
	}
	
	public static void main(String[] args) {
		Main6 obj = new Main6();
		obj.method1();
		obj.method2();
	}
}