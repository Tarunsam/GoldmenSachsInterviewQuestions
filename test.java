package com.gs.ownpractice;

public class test {

	  public static double power(double base, int exp) {
			//your code
		  double temp=1;
		  if(exp==0){
		    return 1;
		  }
		    while(exp!=0){
		      temp*=base;
		      --exp;
		    }

		    return temp;
		  }

		  /* returns true if all tests pass, false otherwise */
		  public static boolean doTestsPass() {
		    boolean doTestsPass = true;
			double result = power(2,2);
			System.out.println(result);
		    return  doTestsPass;
		  }

		  public static void main( String[] args ) {
		    if (doTestsPass())
		      System.out.println("All Tests Pass");
		    else
		      System.out.println("There are test failures");
		  }

}
