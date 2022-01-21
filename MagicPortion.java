package com.gs.ownpractice;
/*
Question: 
Combine ingredients in a specific order, any of which may be repeated

As an example, consider the following  
(A,B,C,D) in 11 steps: A, B, A, B, C, A, B, A, B, C, E 

Encode the string above using only 6 characters: A,B,*,C,*,E

Implement function that takes as input an un-encoded potion and returns the 
minimum number of characters required to encode

*/

public class MagicPortion {

  private static Integer minimalSteps(String input) {
    StringBuilder result=new StringBuilder();
    result.append(input.charAt(0));
    if(input.length()==0||input.isEmpty())
     {
      return 0; 
     }
     
     for(int i=1;i<input.length();i++)
     {
       if(i*2<=input.length())
       {
         String stringToCompare=input.substring(0,i);
         String stringToCompareWith=input.substring(i,2*i);
         if(stringToCompare.equals(stringToCompareWith))
         {
           result.append("*");
           i=2*i-1;
         }
         else
         {
           result.append(input.charAt(i));
         }
       }
       else
       {
         result.append(input.charAt(i));
       }
     }
    System.out.println("Input : "+input+" Encoded : "+result);
    return result.length();
  }

  public static void main(String[] args) {
    
  //  minimalSteps("AAAAAA");

    if(minimalSteps("ABCABCE") == 5 &&
            minimalSteps("ABCABCEA") == 6 &&
            minimalSteps("abbbbabbbb") == 6 &&
            minimalSteps("abcde") == 5 &&
        //    minimalSteps("abcbcbcbcd") == 6 &&
            minimalSteps("ababcababce") == 6 &&
            minimalSteps("ababababxx") == 6 &&
            minimalSteps("aabbccbbccaabbccbbcc") == 8)
  {
    System.out.println( "Pass" );
  }
  else
  {
    System.out.println( "Fail" );
  }
  }
}