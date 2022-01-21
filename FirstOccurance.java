package com.gs.ownpractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstOccurance {
	
	 /**
	  * Finds the first character that does not repeat anywhere in the input string
	  * Given "apple", the answer is "a"
	  * Given "racecars", the answer is "e"
	  **/        
	  public static char findFirst(String input)
	  {
			/*
			 * // code goes here Map<Character,Integer> countMap= new HashMap<>(); char[]
			 * charArray= input.toCharArray(); for(char c: charArray){
			 * if(!countMap.containsKey(c)) countMap.put(c,1); else
			 * countMap.put(c,countMap.get(c)+1); } for(Entry<Character, Integer> e
			 * :countMap.entrySet()) { if(e.getValue()==1) return e.getKey(); } return '\0';
			 */
		  Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		    char[] ch=input.toCharArray();
		    
		    for(char c: ch){
		    
		      if(map.containsKey(c))
		        map.put(c,map.get(c)+1);
		      else
		        map.put(c,1);
		     }
		   
		    for(Entry<Character,Integer> entry:map.entrySet()) {
		    	if(entry.getValue()==1) {
		    		return entry.getKey();
		    	}
		    }
		  
		  return '0';
	  }

	  public static void main(String args[])
	  {

	    String[] inputs = {"apple","racecars", "ababdc"};
	    char[] outputs = {'a', 'e', 'd' };

	    boolean result = true;
	    for(int i = 0; i < inputs.length; i++ )
	    {
	      result = result && findFirst(inputs[i]) == outputs[i];
	      if(!result)
	        System.out.println("Test failed for: " + inputs[i]);
	      else
	        System.out.println("Test passed for: " + inputs[i]);
	    }
	  }
}
