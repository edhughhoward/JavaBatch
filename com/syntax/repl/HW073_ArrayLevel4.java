package com.syntax.repl;

import java.util.Arrays;

public class HW073_ArrayLevel4 {
public static void main(String [] args) {
	/*
	 * Write a program that creates an array of strings with the following
	 * values{"This", "is", "array", "of", "strings"} and prints all values in one
	 * line.
	 * 
	 * Output: This is array of strings
	 */
	
	String [] words = {"This", "is", "array", "of", "strings"};
		for (String element:words) {
			System.out.print(element + " ");
		}
}
}
