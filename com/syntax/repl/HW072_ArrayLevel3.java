package com.syntax.repl;

public class HW072_ArrayLevel3 {
public static void main(String [] args) {
//		Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x} 
//		Print the values so the output should look like below
//
//		Output:
//		syntax
	
	char[] letters = {'s', 's', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
	
	for (char i = 0; i < letters.length; i+=2) {
		System.out.print(letters [i]);
	}
}
}
