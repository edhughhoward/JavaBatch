package com.syntax.repl2;

public class HW_107 {

	public static void main(String[] args) {

//		Given String = "Hello Friends"
//
//				Expected Output:
//				sdneirF olleH
		StringBuffer buffer = new StringBuffer("Hello Friends");

		for (int i = buffer.length() - 1; i >= 0; i--) {
			System.out.print(buffer.charAt(i));
		}
	}
}
