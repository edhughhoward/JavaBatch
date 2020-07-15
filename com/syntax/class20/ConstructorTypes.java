package com.syntax.class20;

public class ConstructorTypes {

	ConstructorTypes(){
		System.out.println("I am a constructor");
	}
	
	ConstructorTypes(String str){
		System.out.println("I am a constructor accepting a string " + str);
	}
	
	ConstructorTypes(int num){
		System.out.println("I am a constructor accepting a int " + num);
	}
	ConstructorTypes(double num2){
		System.out.println("I am a constructor accepting a double " + num2);
	}
	ConstructorTypes(String name, int age){
		System.out.println("I am a constructor accepting 2 parameters " + name + " " + age);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypes obj = new ConstructorTypes("ed", 22);
		System.out.println("I am code inside the main method");
		speak("Hello Class");
	}
	static void speak(String str) {
		System.out.println(str);
	}
	
}
