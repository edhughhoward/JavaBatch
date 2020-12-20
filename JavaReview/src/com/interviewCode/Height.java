package com.interviewCode;

import java.util.Arrays;

public class Height {
    public static void main(String[] args) {        
        Height main = new Height();
        int result = main.heightChecker(new int[] {1, 5, 4, 2, 6, 3});
        System.out.println(result);
    }
     
    /* Solution */   
    public int heightChecker(int[] heights) {
        int[] newHeights = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            newHeights[i] = heights[i];
        }
         
        Arrays.sort(heights);
         
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(newHeights[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}