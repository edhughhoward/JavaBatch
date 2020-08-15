package com.syntax.repl6;

import java.util.ArrayList;

public class Main185 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		num.add(111);
		num.add(111);
		num.add(111);
		num.add(999);
		num.add(999);
		num.add(999);

		for (Integer n : num) {
			System.out.println(n);
		}

	}
}
