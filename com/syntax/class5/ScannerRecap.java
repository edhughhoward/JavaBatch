package com.syntax.class5;
import java.util.Scanner;
public class ScannerRecap {
 public static void main(String [] args) {
	 
	 Scanner myScanner = new Scanner(System.in);
	 
	 System.out.println("Please write a long text");
	 
	 String text1 = myScanner.next();
	 
	 System.out.println(text1);
	 
	 System.out.println("Please write a long text");
	 String text2 = myScanner.next();
	 System.out.println(text2);
	 
	 System.out.println("Please write a long text");
	 String text3 = myScanner.next();
	 System.out.println(text3);
 }
}
