package com.gs.ownpractice;

public class CountNumberOfCycle {

	 /**
	   *
	   * You have an integer array.
	   * Starting from arr[startIndex], follow each element to the index it points to. 
	   * Continue to do this until you find a cycle. 
	   * Return the length of the cycle. If no cycle is found return -1
	   *
	  */
	  public static int countLengthOfCycle( int[] arr, int startIndex ) {
		  
		  int start=startIndex; int end=startIndex;
		  boolean isloop=false;
		  int length=0;
		  while(start<arr.length & end<arr.length) {
			  start=arr[start];
			  end=arr[arr[end]];
			  
			  if(start==end) {
				  isloop=true;
			  	  break;
			  }
				 
		  }
		  
		  if(isloop) {			  
			  end=arr[end];
			  length=1;
			  while(start!=end) {
				  end=arr[end];
				  length+=1;
			  }
		  }
		  System.out.println(length);
		  return length;
	  }

	 public static void main( String[] args ) {
		 
		 
		 boolean testsPassed = true;
		  
//		  testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
//		  testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;
		  testsPassed &= countLengthOfCycle(new int[]{1, 2,3,4,2}, 0) == 3;
		  
		  if(testsPassed) {
		    System.out.println( "Test passed." );
		    //return true;
		  } else {
		    System.out.println( "Test failed." );
		    //return false;
		  }


		  }
}
