package com.syntax.repl3;

public class HW_140 {
protected static String maxLength(String [] arr) {
	int largest = 0;
	String longestString = null;
	for (String s : arr) {
		if (s.length() > largest) {
			largest = s.length();
			longestString = s;
		}
	}
	return longestString;
}
public static void main(String[] args) {
	String[] arr = {"hey","yolo","hi","this is long"};
	System.out.println(maxLength(arr));
	//should print "this is long"
}

}

