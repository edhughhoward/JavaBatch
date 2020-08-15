package com.syntax.repl2;

public class HW_124 {
	/*
	 * Declare static variable in class level as below and assign its value:
	 * String ss="Welcome To Syntax Technologies"
	 * Access variable in the main method and print it using three ways you learned
	 * so far
	 * Hint: first way: By calling directly Second way: By using the className Third
	 * way: By creating the object of the class
	 * Expected Output: Welcome To Syntax Technologies Welcome To Syntax
	 * Technologies Welcome To Syntax Technologies
	 */

	public static String ss = "Welcome To Syntax Technologies";
	public static void main(String[] args) {
		HW_124 obj = new HW_124();
System.out.println(ss); // calling directly
System.out.println(HW_124.ss); // calling by class name
System.out.println(obj.ss); // creating the object of the class
	}
}
