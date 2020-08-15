package com.syntax.repl6;

import java.util.ArrayList;

public class Main186 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		num.add(111);
		num.add(222);
		num.add(333);
		num.add(444);
		num.add(555);
		num.add(666);

		for (Integer n : num)
			System.out.println(n);
		num.clear();
		System.out.println(num);
	}
}
