package com.syntax.repl5;

public class Main1 {

	final String REVERSE(String a) {
		String newString = "";
		for (int i = a.length() -1; i >=0; i-- ) {
			
			newString += a.charAt(i);
		}
		System.out.println(newString);
		return newString;
	}
	public static void main(String[] args) {
		Main1 obj = new Main1();
		obj.REVERSE("hello");
		
		StringBuffer str = new StringBuffer("goodbye");
		StringBuffer str1 = str.reverse();
		
		System.out.println(str1);
		
		
	}
}
