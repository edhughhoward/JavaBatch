package com.syntax.repl2;

public class HW_098 {
public static void main(String [] args) {
//	Create a String given="Hello Syntax friends". 
//			Using String methods from given String create new String "Welcome Syntax family"
	
	String string1 = "Hello Syntax friends";
	
	string1 = string1.replace("Hello", "Welcome").replace("friends", "family");  
	
	System.out.println(string1);
}
}
