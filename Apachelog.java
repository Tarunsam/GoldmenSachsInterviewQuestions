package com.gs.ownpractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apachelog {

	public static String findTopIpaddress(String[] lines) {
	    // Your code goes here
		Pattern pattern=Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
		
		Map<String,Integer> mapCount=new LinkedHashMap<>();
		for(int i=0;i<lines.length;i++)
	    {
	      Matcher matcher=pattern.matcher(lines[i]);
	      if(matcher.find())
	      {
	    	  String str=matcher.group();
	    	  if ( mapCount.get(str) == null ) {
	    		  mapCount.put(str, 1);
	          }
	          else {
	        	  mapCount.put(str, mapCount.get(str) + 1);
	          }
	      }
	      else
	      {
	        System.out.println("IP Address not found in this line");
	      }
	    }
		int max=Collections.max(mapCount.values());

			for(Entry<String,Integer> maplist:mapCount.entrySet()) {
				//System.out.println(maplist.getKey()+" :: "+maplist.getValue());
				if(maplist.getValue()==max) {
					return maplist.getKey();
				}
			}
					
		return "-1";
	  }
	  
	     
	  
	  public static void main(String[] args) {
	    
	String lines[] = new String[] {
	        "10.0.0.1 - log entry 1 11",
	        "10.0.0.1 - log entry 2 213",
	        "10.0.0.2 - log entry 133132",
	        "sjdfsdf 10.0.0.1 asds",
	        "sjdfsdf 10.0.0.1 asds"};
	    String result = findTopIpaddress(lines);
	    
	    if (result.equals("10.0.0.1")) {
	      System.out.println("Test passed");
	      
	    } else {
	      System.out.println("Test failed");
	      
	    }  

	  }
	  
}
