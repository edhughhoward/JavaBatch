package com.syntax.repl2;

public class HW_092 {

	public static void main(String[] args) {
//		Validate if the string ends with "u" prints the boolean value accordingly.
//		Validate if the string ends with "world" prints the boolean value accordingly.
//		Validate if the string ends with "are" prints the boolean value accordingly.
//		Validate if the string ends with "you" prints the boolean value accordingly.
//		
		  String s1="hello how are you"; 
		  
		  boolean endletter = s1.endsWith("u");
		  boolean endword = s1.endsWith("world");
		  boolean endword2 = s1.endsWith("are");
		  boolean endword3 = s1.endsWith("you");
		  
		  System.out.println(endletter);
		  System.out.println(endword);
		  System.out.println(endword2);
		  System.out.println(endword3);
	}

}
