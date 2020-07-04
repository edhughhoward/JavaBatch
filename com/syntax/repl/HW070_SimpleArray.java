package com.syntax.repl;

public class HW070_SimpleArray {
public static void main(String [] args) {
//	Write a program that creates an array of integers and stores the following values: 
//	45, 78, 12,  67, 55 and then prints all array values. 
//
//	Output:
//	45 78 12 67 55
	   
    int[] numbers = { 45, 78, 12, 67, 55 };

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");
		}
    }
  }
