package com.syntax.repl6;

import java.util.LinkedList;
import java.util.List;

public class Main193 {
	public static void main(String[] args) {

		List<Integer> num = new LinkedList<>();
		num.add(111);
		num.add(222);
		num.add(333);
		num.add(444);
		num.add(555);
		num.add(666);

		int result = 0;

		for (Integer n : num) {
			result = result + n;
		}
		System.out.println(result);
	}
}
