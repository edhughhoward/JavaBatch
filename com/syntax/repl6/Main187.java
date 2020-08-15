package com.syntax.repl6;

import java.util.ArrayList;

public class Main187 {

	public static void main(String[] args) {

		ArrayList<String> word = new ArrayList<>();

		word.add("hi");
		word.add("yo");
		word.add("sup");
		word.add("yolo");
		word.add("boop");

		word.remove(0);
		word.remove(1);
		word.remove(2);

		System.out.println(word);
	}
}
