package com.syntax.class15;

public class ReplaceFunction {
public static void main(String[] args) {
	
	String me = "I am a good tester. I am a good person";
	
	String str = "Hello";
	
	str = str.replace('e', 'E');
	
	me=me.replace("good", "GREAT");
	System.out.println(str);
	System.out.println(me);
	
	me = me.replace("we", "us");
	// if .replace finds the word it will replace, if not nothing will change
	System.out.println(me);
	
	String fromApplication = "Phone number is 1234567890";
	fromApplication = fromApplication.replaceAll("[A-Z]", "");
	
	System.out.println(fromApplication);
	
	fromApplication = fromApplication.replaceAll("[a-z]", "");
	System.out.println(fromApplication.trim());
	
	fromApplication=fromApplication.trim();
	System.out.println(fromApplication);
	
	String string2 = "Hello1234566";
	string2 = string2.replaceAll("[A-Z]", "").replaceAll("[a-z]", "").trim();
	
	System.out.println(string2);
	
	String string3 = "HELLOWW hellow 234858767";
	string3 = string3.replaceAll("[A-Za-z]", "").trim();
	System.out.println(string3);
	
	String mix = "Hello friends 123 87990";
	mix = mix.replaceAll("[0-9]", "");
	System.out.println(mix);
	
	String mix1 = "hello *&^%$";
	mix1 = mix1.replaceAll("[^A-Za-z0-9]", "");
	
	System.out.println(mix1);
}
}
