package com.gs.ownpractice;
public class MinJumpOfLadderStep {
	 public static void main(String[] args) {
		 Stair a = new Stair();
	    int n = 10;
	    System.out.println(a.totalWaysToReachNthStair(n));
	    
	   
	  }		  
		}


		 class Stair {
			  
			  public int totalWaysToReachNthStair(int n) {
			    if(n == 0) 
			      return 1;
			    if(n == 1 || n==2 || n==3) 
			      return 1;
			    
			    return 1+Math.min(Math.min(totalWaysToReachNthStair(n - 1) , totalWaysToReachNthStair(n - 2)) , totalWaysToReachNthStair(n - 3));
			  }
			  
				}