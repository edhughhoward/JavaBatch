package com.syntax.repl3;

public class HW_127 {
	/*
	 * Create two methods: The first method should be a non-static method that will
	 * print out the following message: "Programming is amazing."
	 * 
	 * The second method should be a static method that will print out the following
	 * message: "Java is awesome."
	 * 
	 * Execute both methods
	 * 
	 * Expected Output: Programming is amazing. Java is awesome.
	 */

	void method1() {
		System.out.println("Programming is amazing");
	}

	static String method2 = "Java is awesome";

	public static void main(String[] args) {
		HW_127 obj = new HW_127();
		obj.method1();
		System.out.println(method2);
	}
}
