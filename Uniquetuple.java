package com.gs.ownpractice;

import java.util.Arrays;
import java.util.HashSet;

public class Uniquetuple {

	public static HashSet<String> uniqueTuples( String input, int len ) {
	    // your code
		 HashSet<String> result = new HashSet<String>();

			/*
			 * for(int i=0;i<input.length();i++) { for(int j=i+1;j<input.length();j++) { //
			 * if(j+len-1<=input.length()) // { //
			 * result.add(input.charAt(i)+input.substring(j,j+len-1)); // }
			 * result.add(input.charAt(i)+input.substring(j,j+len-1)); } }
			 */
		 
		 for(int i=0;i<input.length();i++)
		    {
		      for(int j=i+1;j<input.length()&&(j+len-1<=input.length());j++)
		      {
		        String temp=input.charAt(i)+input.substring(j,j+len-1);
		        result.add(temp);
		        System.out.println(temp);
		      }
		    }
		    
		    System.out.println(result);
		    
		    return result;
	  }

	  public static void main( String[] args ) {
	    String input = "abcd";
	    HashSet<String> result = uniqueTuples( input, 2 );
	    if( result.contains( "ab" ) &&result.contains( "bc" ) ) {
	      System.out.println( "Test passed." );
	     
	    } else {
	      System.out.println( "Test failed." );
	      
	    }
	  }
}
