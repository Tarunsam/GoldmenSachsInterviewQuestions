package com.gs.ownpractice;

public class StairCase {

	 public static Integer countSteps(Integer n) {
	      if (n == 0)
	      return 1;
	      if (n == 1)
	      return 1;
	      if (n == 2)
	      return 2;
	      return countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3);
	      }
	  


	  public static boolean doTestsPass()
	  {
	    return countSteps(3) == 4
	      && countSteps(4) == 7;
	  }

	  public static void main(String[] args)
	  {
	    if(doTestsPass())
	    {
	      System.out.println("All tests pass");
	    }
	    else
	    {
	      System.out.println("Tests fail.");
	    }

//	    for (Integer n = 1; n <= 5; n++)
//	    {
//	      Integer numberOfCombinations = countSteps(n);
//	      System.out.println(n + " steps => " + numberOfCombinations);
//	    }
	  }
}
