package com.syntax.repl3;

public class HW_133 {
	static int countA(String s) {
		int number = 0;
		char a = 'a';
		char aA = 'A';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == a || s.charAt(i) == aA) {
				number++;
			}
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(countA("aaA")); // 3
		System.out.println(countA("aaBBdf8k3AAadnklA")); // 6
	}
}
