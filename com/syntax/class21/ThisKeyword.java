package com.syntax.class21;

public class ThisKeyword {

	int a, b;
	
	ThisKeyword(){
		System.out.println("I am a constructor that you do not really need");
	}
	ThisKeyword(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void sum(int a, int b) {
		// checks total of local variables
		// System.out.println(a+b);
		// checks total of instance variables
		System.out.println(this.a+this.b);
	}
}
