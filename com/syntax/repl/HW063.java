package com.syntax.repl;

import java.util.Scanner;

public class HW063 {
	  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    int x = inp.nextInt();
		    
		    for (int num =0; num < (x*2); num++) {
		    	System.out.print(num + " ");
		    }
		    
inp.close();
		  }
		}
