package com.syntax.repl4;

public class Method {
	
	static int sum = 0;
	 
	  public static int sumOfElements(int[][] arr){
	    for(int[] a : arr){
	      for(int b : a){
	        sum += b;
	      }
	    }return sum;
	  }
}
