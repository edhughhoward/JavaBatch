package com.syntax.repl4;

public class Kitten2 extends Animal{
	
	Kitten2(String type){
		super(type);
	}
	public void eat() {
		System.out.println(type + " eats snacks");
	}
}