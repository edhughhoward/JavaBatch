package com.syntax.repl2;

public class HW_119 {

String censor;
	public String censorLetter(String word, String letter) {
		censor = word.replace(letter, "*");
		return censor;
	}
	
	public static void main(String[] args) {
		HW_119 obj = new HW_119();
		
		System.out.println(obj.censorLetter("computer", "e"));
	}
	
}
