package com.gs.ownpractice;

public class OptimalPathOwn {
	
	public static Integer optimalPath(Integer[][] grid)
	  {
	  // your code goes here
		int total=0;
		int x=grid.length-1;int y=0;
		total+=grid[x][y];
		
		for(int i=grid.length-1;i>=0;i--)
			total+=grid[i][y];
		
		for(int j=0;j<grid[0].length-1;j++)
			total+=grid[x][j];
		
		for(int i=grid.length-2;i>=0;i--) {
			for(int j=1;j<grid[0].length-1;j++) {
				total+=Math.max(grid[i-1][j], grid[i][j-1]);
			}
		}
		
		
	  return 0;
	  }
	
	
	
	
	 public static boolean doTestsPass()
	  {
	  boolean result = true;
	  result &= optimalPath(new Integer[][]{{0,0,0,0,5},
	                      					{0,1,1,1,0},
	                      					{2,0,0,0,0}}) == 10;    
	  return result;
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
	  }

}
