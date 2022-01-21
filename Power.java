package com.gs.ownpractice;
 class Power {

  /* Given base and integer exponent, compute value of base raised to the power of exponent.
   * Can you implement a solution faster than O(exp)?
   */
	/* 2^6=2^3*2^3
	 * 2^7=2^3*2^3*2
	 * public static double power(double base, int exp) { //your code double temp=1;
	 * if(exp==0){ return 1; } while(exp!=0){ temp*=base; exp--; }
	 * 
	 * return temp; }
	 */
  public static double power1(double base, int exp) {
      //your code
      if(exp==0) return 1;
      else if (exp%2==0) return power1(base,exp/2)* power1(base,exp/2);
      else return power1(base,exp/2)* power1(base,exp/2)*base;
      }
  
  

  /* returns true if all tests pass, false otherwise */
  public static boolean doTestsPass() {
    boolean doTestsPass = true;
	double result = power1(2,3);
	if(result!=8) doTestsPass=false;
    return  doTestsPass;
  }

  public static void main( String[] args ) {
    if (doTestsPass())
      System.out.println("All Tests Pass");
    else
      System.out.println("There are test failures");
  }
 }