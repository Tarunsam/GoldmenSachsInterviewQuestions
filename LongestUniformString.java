package com.gs.ownpractice;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class LongestUniformString {
	/**
	 *  
	 *  e.g.
	 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
	 */

	//  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

//	  static int[] longestUniformSubstring(String input){
//		  int longestStart = -1;
//		    int longestLength = 0;
//		    char[] ch=input.toCharArray();
//		    int max=1;int index=1;
//		    for(int i=0;i<input.length();i++) {
//		    	int count=1;
//		    	if(ch[i]==(ch[i+1])& i<input.length()) {
//		    		count++;
//		    		i++;
//		    	}
//		    	if(count>max) {
//		    		index=i;
//		    		max=count;
//		    	}
//		    }
//		    
//		    
//
//	    return new int[]{ index, max };
//	  }
	
//	abbbcc=13
	/*
	 * a=1
	 * b=3
	 * c=2
	 * 
	 * ab
	 * abbbb  -i1  - i2   
	 */

	  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

	  static int[] longestUniformSubstring(String input){
	  
	    char[] ch=input.toCharArray();
	    int max=0;int index=0;
	    if(input=="") {
	    	return new int[]{ -1, 0 };
	    }
	    else {
		    for(int i=0,j=0;i<input.length();i++) {
		    	int count=1;
		    	j=i;
		    	while(i<input.length()-1 && ch[i]==ch[i+1]) {	    		
		    		count++;
		    		i++;
		    	}
		    	
		    	if(count>max) {
		    		index=j;
		    		max=count;
		    	}
		    }
	    }
	    // your code goes here
	    return new int[]{ index, max };
	  }

	  public static void main(String[] args) {
	    testCases.put("", new int[]{-1, 0});
	    testCases.put("1000011111", new int[]{5, 5});
	    testCases.put("aabbbbbCdAA", new int[]{2, 5});
	    testCases.put("abbbccda", new int[]{1, 3});

	    boolean pass = true;
	    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
	      int[] result = longestUniformSubstring(testCase.getKey());
	      pass = pass && (Arrays.equals(result, testCase.getValue()));
	    }
	    if(pass){
	      System.out.println("Pass!");
	    } else {
	      System.out.println("Failed! ");
	    }
	  }
}
