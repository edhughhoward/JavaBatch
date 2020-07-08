package com.syntax.repl2;

public class HW_106 {

	public static void main(String[] args) {
//		Instantiate and StringBuffer class
//		Append Value "Hello" to it
//		Append value "World" to it. 
//		Print in UPPERCASE. 

		StringBuffer buffer = new StringBuffer("Hello ");

		buffer.append("World");

		System.out.println(buffer.toString().toUpperCase());
	}
}
