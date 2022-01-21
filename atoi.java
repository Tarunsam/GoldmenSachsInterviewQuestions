package com.gs.ownpractice;

public class atoi {
	
	// "42" - 42

	public static int atoi(String str)
	  {
	  int result = 0;
	  int strLength = str.length();

		  for(int i=0;i<str.length();i++) {
			 // System.out.println(str.charAt(i)*1);
			  result=result*10+str.charAt(i)-'0';
		  }
	  return result;
	  }

	  public static boolean pass()
	  {
	  boolean result = true;
	  result = result && (atoi("3") == 3);
	  result = result && (atoi("1") != 2);
	  result = result && (atoi("89789") == 89789);

	  return result;
	  }

	  public static void main(String[] args)
	  {
	  if(pass())
	  {
	    System.out.println("Pass");
	  }
	  else
	  {
	    System.out.println("Some fail");
	  }
	  }
}
