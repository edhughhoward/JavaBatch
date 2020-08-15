package com.syntax.repl4;

public class Cat extends Animal{
	Cat(String type){
		super(type);
	}
	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}
