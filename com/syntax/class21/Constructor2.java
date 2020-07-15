package com.syntax.class21;

public class Constructor2 {
	Constructor2() {
		this(1);
		System.out.println("Hi");
	}

	Constructor2(int x) {
		this(1, 2);
		System.out.println("Hello");
	}

	Constructor2(int x, int y) {
		System.out.println("How are you");
	}

	public static void main(String[] args) {
	
		Constructor2 obj = new Constructor2();
		
	}
	

}
