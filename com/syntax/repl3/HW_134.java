package com.syntax.repl3;

public class HW_134 {
	static int  countVowels(String s)
	{
		String count = s.replaceAll("[^aA,eE,iI,oO,uU]", "");
		return count.length();
	}
	
	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(countVowels("obama")); // 3
		System.out.println(countVowels("happy friday! i love weekends")); // 9
	}
}
