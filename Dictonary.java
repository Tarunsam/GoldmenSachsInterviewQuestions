package com.gs.ownpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

//Given a a string of letters and a dictionary, the function longestWord should
//find the longest word or words in the dictionary that can be made from the letters
//Input: letters = "oet", dictionary = {"to","toe","toes"}
//Output: {"toe"}

class Dictionary1 {
	  private String[] entries;

	  public Dictionary1(String[] entries) {
	    this.entries = entries;
	  }
	  
	  public String[] getEntries()
	  {
	    return this.entries;
	  }

	  public boolean contains(String word) {
	    return Arrays.asList(entries).contains(word);
	  }
	}
public class Dictonary {

	public static Set<String> longestWord(String letters, Dictionary1 dict) {
		
		Set<String> result = new HashSet<String>();
		HashMap<String,ArrayList<String>> mapOfWords=new HashMap<String,ArrayList<String>>();
	    
	    String[] allDictWords=dict.getEntries();
	    
	    for(String str:allDictWords) {
	    	char []ch=str.toCharArray();
	    	Arrays.sort(ch);
	    	String sortedword=new String(ch);
	    	if(mapOfWords.get(sortedword)==null) {
	    		ArrayList<String> list=new ArrayList<String>();
	    		list.add(str);
	    		mapOfWords.put(sortedword, list);
	    	}
	    	else
	    	{
	    		mapOfWords.get(sortedword).add(str);
	    	}
	    }
		
	    
	    mapOfWords.forEach((k,v) ->{
	    	System.out.println("Key "+k +" Value "+v);
	    });
		
	    char []char1=letters.toCharArray();
	    Arrays.sort(char1);
	   
	    String sortedword=new String(char1); System.out.println("Sorted :"+sortedword);
	    
	    for(Entry<String, ArrayList<String>> entry:mapOfWords.entrySet()) {
	    	if(entry.getKey().equals(sortedword)) {
	    		System.out.println("Result:"+entry.getValue());
	    		result.add(letters);
	    	}
	    }
	    	
	    System.out.println(result);
	    
	    
	    
	    return result;
	  }


	  public static boolean pass() {
	    Dictionary1 dict = new Dictionary1(new String[]{"to", "toe", "toes", "doe", "dog", "godddddd", "dogs", "banana"});
	    boolean r = new HashSet<String>(Arrays.asList("toe")).equals(longestWord("oet", dict));
	    return r;
	  }

	  public static void main(String[] args) {
	    if(pass()) {
	      System.out.println("Pass");
	    } else {
	      System.err.println("Fails");
	    }
	  }
}
