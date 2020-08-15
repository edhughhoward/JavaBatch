package com.syntax.repl4;

public class Kitten1 extends Animal{
	Kitten1(String type){
		super(type);
	}
	public void eat() {
		System.out.println(type + " eats milk");
	}
}
