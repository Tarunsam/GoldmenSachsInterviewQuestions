package com.gs.ownpractice;

public class AddFraction {

	public static int[] addFractions( int[] fraction1, int[] fraction2 ) {
	    // Write your code here
		
		int size1=fraction1.length;int size2=fraction2.length;
		
		if(size1>size2) {
			
			int result=(fraction1[0]+(fraction1[1]*fraction2[0]));
			
			
			return new int[] {result,fraction1[1]};
		}
		
//		if(size1<size2) {
//			
//			int result=(fraction1[0]+(fraction1[1]*fraction2[0]))/fraction1[1];
//			
//			return new int[] {result,fraction1[1]};
//		}
		else {
		int num1= fraction1[0];
		int den1=fraction1[1];
		
		int num2= fraction2[0];
		int den2= fraction2[1];
		
		
		int lcm=(den1*den2)/gcd(den1,den2);
	
		
		int v=num1*(lcm/den1)+num2*(lcm/den2);  // (num1*lcm)/den1+(num2*lcm)/den2; 
		
		
		System.out.println(lcm+" "+v);
		int gcd=gcd(lcm,v);
		
		lcm=lcm/gcd;
		v=v/gcd;
		
	    return  new int[]{ v, lcm} ;
	    }
	  }
	
	  private static int gcd(int a, int b){
		  if(a==0)
			  return b;
		  return gcd(b%a,a);
	  }
	
	public static void main( String[] args ) {
	 //   int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );
		int[] result = addFractions( new int[]{ 1, 3 }, new int[]{ 3,5} );

	    if( result[ 0 ] == 10 && result[ 1 ] == 3 ) {
	      System.out.println( "Test passed." );
	    } else {
	      System.out.println( "Test failed." );
	    }
	  }
}
