package com.interviewCode;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class GroupBy {
	public static String GroupTotals(String[] strArr) {
		  Map<String,Integer> map=new TreeMap<>();  
		for(int i=0; i<strArr.length;i++){
		String[] entries=strArr[i].split(":");
		String key=entries[0];
		Integer value=  map.get(key);
		if(value!=null){

		value=value+Integer.parseInt(entries[1]);
		map.put(key,value);
		}else{
		  map.put(key,Integer.parseInt(entries[1]));
		}
		}
		Set<String> Iterator=map.keySet();
		String str="";
		for(String entry:Iterator){
		  
		if(map.get(entry)!=0){
		str=str+entry+":"+ map.get(entry)+",";
		}
		}
		    return str.substring(0,str.length()-1);
		  }

		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    System.out.print(GroupTotals(s.nextLine())); 
		  }

		}

