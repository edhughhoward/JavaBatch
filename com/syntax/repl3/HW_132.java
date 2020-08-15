package com.syntax.repl3;

public class HW_132 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 1, 3, 5, 7 } };
		reduce10(a);
		// print the elements from new array
		for (int i = 0; i < reduce10(a).length; i++) {
			for (int j = 0; j < reduce10(a)[i].length; j++) {
				System.out.print(reduce10(a)[i][j] + " ");

			}
			System.out.println();
		}
		// print the elements from new array
	}

	// create method reduce10 here
	static int[][] reduce10(int[][] array) {
		int[][] arr = new int[3][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				arr[i][j] = array[i][j] - 10;
			}
		}
		return arr;
	}

}