package com.gs.ownpractice;

public class PascalTree {

	/*1
	 *1 1
	 *1 2 1
	 *1 3 3 1
	 *1 4 6 4 1
	 *1 51010 5 1
	 */
	
	
	
	
	  public static  int pascal(int col, int row){
		  
		  int c[][]=new int[row+1][row+1];
		  if(row==0 & col==0) {
			  return 1;
		  }
		  else {
			  for(int i=0;i<=row;i++) {
				  for(int j=0;j<=i;j++) {
					  
					  if(j==0) {
						  c[i][j]=1;
					  }
					  else if(i==j) {
						  c[i][j]=1;
					  }
					  else {
						  c[i][j]=c[i-1][j-1]+c[i-1][j];
					  }
				  }
			  }
		  }

		    return c[row][col];
		  }

		  public static void main(String[] args) {
			  if(PascalTree.pascal(0,0) ==  1 &&
					  PascalTree.pascal(1,2) ==  2 &&
							  PascalTree.pascal(5,6) ==  6 &&
									  PascalTree.pascal(4,8) ==  70 &&
											  PascalTree.pascal(6,6) ==  1) {
				  System.out.println("Pass");		  
			  }else {
				  System.out.println("Failed");
			  }
		  }
}
