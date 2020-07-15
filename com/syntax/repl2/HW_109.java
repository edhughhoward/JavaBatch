package com.syntax.repl2;

public class HW_109 {
	/*
	 * 1. Create method name it as newLine 2. Add print statement inside method body
	 * as "newLine method implementation" 3. Call newLine method three times
	 * 
	 * Expected Output: newLine method implementation newLine method implementation
	 * newLine method implementation
	 */
	
	void newLine() {
		System.out.println("newLine method implementation");
	}
	
	public static void main(String[] args) {
		
		HW_109 method = new HW_109();
		
		method.newLine();
		method.newLine();
		method.newLine();
	}
	
	
}
