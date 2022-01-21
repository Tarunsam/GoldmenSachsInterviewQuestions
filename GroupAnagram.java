package com.gs.ownpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/*
 * This program prints set of anagrams together in given string 
 * 
 * eg. 
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 *	
 *
 *[act-{cat,tac},dgo-{dog,god,dog},ast-{sat,tas}]
 */

public class GroupAnagram {

	static String input = "cat dog tac sat tas god dog";
	  
//	  static void setOfAnagrams(String inputString){ 
//	    Map<String, List<String>> anagramGroup = new LinkedHashMap<>();
//	    String[] inputArray = inputString.split(" ");
//	    for (String input : inputArray) {
//	      char[] word = input.toCharArray();
//	      Arrays.sort(word);
//	      if (!anagramGroup.containsKey(String.valueOf(word))) {
//	        List<String> wordsList = new ArrayList<>();
//	        wordsList.add(input);
//	        anagramGroup.put(String.valueOf(word), wordsList);
//	      } else {
//	        anagramGroup.get(String.valueOf(word)).add(input);
//	      }
//
//	    }
//	anagramGroup.forEach((k, v) -> {
//	for (String string : v) {
//	System.out.print(string+" ");
//	}
//	});
//	    
//	    
//	  }
	
	/* setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
	 * act -[cat,tac] , dgo-[dog, god, dog],ast-[sat,tas]
	 * 
	 */
	
	static void setOfAnagrams(String inputString) {
		Map<String, List<String>> map=new  LinkedHashMap<>();
		
		String[] str=inputString.split("[,. ]");
		
		for(String st:str) {
			char[] chararray=st.toCharArray();
			Arrays.sort(chararray);
			
			String sp=new String(chararray);
			
			if(!map.containsKey(sp)) {
				List<String> word=new ArrayList<String>();
				word.add(st);
				map.put(sp, word);
			}
			else {
				map.get(sp).add(st);
			}
			
		}
		
		map.forEach((k, v) -> {
			for (String string : v) {
			System.out.print(string+" ");
			}
			});
	}
	  
	  
	  public static void main(String[] args) {
	    
	    String input = "cat,dog.tac sat tas god dog";
	    setOfAnagrams(input);
	    
	  }
}
