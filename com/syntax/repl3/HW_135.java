package com.syntax.repl3;

public class HW_135 {
	static String surround(String a, String letter){
		String words = a.replaceAll(letter, "(" + letter + ")" );
		return words;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
	}
}