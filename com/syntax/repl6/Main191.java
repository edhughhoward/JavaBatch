package com.syntax.repl6;

import java.util.ArrayList;

public class Main191 {

	public static void main(String[] args) {

		ArrayList<Boolean> listA = new ArrayList<>();

		listA.add(true);
		listA.add(false);
		listA.add(false);

		ArrayList<Boolean> listB = new ArrayList<>();

		listB.addAll(listA);
		System.out.println(listB);

	}
}
