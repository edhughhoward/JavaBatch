package com.syntax.repl2;

public class HW_118 {
	public static void main(String[] args){
		 
		HW_118 obj=new HW_118();
		
		System.out.println(obj.spaceOut("hello"));
			System.out.println(obj.spaceOut("technology"));
		}
		
		String spaceOut(String str) {
			
			String newString="";
			
			for(int i=0; i<str.length(); i++ ) {
				newString=newString+str.charAt(i)+" ";
			}
			
			return newString;
		}
	}