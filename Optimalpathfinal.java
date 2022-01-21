package com.gs.ownpractice;

public class Optimalpathfinal {

	 public static Integer optimalPath(Integer[][] grid)
	  {
	   int total=0;
	   total=findOptimalPathRec(grid,grid.length-1,0,0);
	  return total;
	  }

	  public static Integer findOptimalPathRec(Integer[][] grid,int x, int y, int total)
	  {
	   int total1=0,total2=0; 
	   System.out.println("X : "+x+" : Y : "+y+" : "+total);
	   if(x==0&&y==grid[0].length-1)
	   {
	     return total+grid[0][grid[0].length-1];
	   }
	    total+=grid[x][y];
	   if(x>0)
	   {
	     total1=findOptimalPathRec(grid,x-1,y,total);
	   }
	   if(y<grid[0].length-1)
	   {
	     total2=findOptimalPathRec(grid,x,y+1,total);
	   }
	    total=Math.max(total,Math.max(total1,total2));
	    System.out.println("Going to Return : "+total);
	    return total;
	  }
	  public static boolean doTestsPass()
	  {
	  boolean result = true;
	  result &= optimalPath(new Integer[][]{{0,0,0,0,5},
	                      {0,1,1,1,0},
	                      {2,0,0,0,0}}) == 10;    
	  
	  result &= optimalPath(new Integer[][] {
			{ 0, 0, 10 }, 
			{ 0, 1, 1 }, 
			{ 2, 0, 5} }) == 18;
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
