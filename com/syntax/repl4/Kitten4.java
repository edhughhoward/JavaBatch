package com.syntax.repl4;

public class Kitten4 extends Animal{

	Kitten4(String type){
		super(type);
	}
	public void eat() {
		System.out.println(type + " eats everything");
	}
}