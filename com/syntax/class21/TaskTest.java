package com.syntax.class21;

public class TaskTest {

	
	public static void main(String[] args) {
		
		booze spirit1 = new booze();
		spirit1.type = "Tequila";
		spirit1.color = "Gold";
		spirit1.smell = true;
		System.out.print("If you drink " + spirit1.type + " " + spirit1.color + " ");
		spirit1.feel();
		
		vodka spirit2 = new vodka();
		spirit2.type = "Vodka";
		spirit2.color = "clear";
		spirit2.smell = false;
		
		System.out.print("If you drink " + spirit2.type + " " + spirit2.color + " ");
		spirit2.wodka();
		spirit2.feel();
		
	}
}
