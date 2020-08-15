package com.syntax.repl6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main188 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			int num = scan.nextInt();
			list.add(num);
		}
		for (int n : list) {
			System.out.println(n + " ");
		}
	}
}
