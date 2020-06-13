package com.syntax.class04;

public class NestingElseif {
	public static void main(String [] args) {
		/*if student completed the quiz we will check the score
		 * if score > 90 --> great job
		 * if score > 80 --> well done
		 * if score > 70 --> just passed
		 * otherwize --> you failed
		 * 
		 * if student didnt' complete the quiz, please finish your quiz
		 * 
		 */
		
		boolean completed = true;
		int grade = 9;
	
		if (completed) { 
			if (grade >= 90) {System.out.println("A-Great Job!!");}
			else if (grade >= 80) {System.out.println("B-Well Done!");}
			else if (grade >= 70) {System.out.println("C-Just Passed.");}
			else if (grade <= 70) {System.out.println("F-YOU FAILED");}	
		}else{System.out.println("Please finish your quiz");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
