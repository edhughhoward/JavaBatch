package com.syntax.class21;

public class Constructor {

	String word;
	
	public Constructor() {
		System.out.println("I am a non argument constructor");
	}
	
	public Constructor(String word) {
		this();
		this.word = word;
		
	}
	
	
	public static void main(String[] args) {

		Constructor obj = new Constructor("Java");
		System.out.println(obj.word);
	}

}
