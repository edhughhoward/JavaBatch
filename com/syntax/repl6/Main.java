package com.syntax.repl6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


	class Main {
		  public static void main(String[] args) {
		     int a=10, b=0, result;
		     
		     try{
		     result = a/b;
		     } catch(ArithmeticException e){
		       String eMessage = e.getMessage();
		       System.out.println(eMessage);
		     }
		  }
		}