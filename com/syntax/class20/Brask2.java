package com.syntax.class20;

public class Brask2 {
	String type;

	public Brask2() {
		System.out.println("This is a public constructor");
	}

	protected Brask2(String constructor) {
		System.out.println("I am a protected constructor");

	}

	Brask2(int a) {
		System.out.println("This is a default constructor");
	}

	private Brask2(String hello) {
		System.out.println("This is a private constructor");
	}

	public static void main(String[] args) {
	new Brask2("Testing");
	
	}

		
}

