package com.syntax.repl6;

import java.util.LinkedList;
import java.util.List;

public class Main192 {
	public static void main(String[] args) {

		List<Integer> prime = new LinkedList<>();
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				prime.add(i);
			}
		}
		System.out.println(prime);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
