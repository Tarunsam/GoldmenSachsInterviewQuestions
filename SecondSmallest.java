package com.gs.ownpractice;

public class SecondSmallest {

	
	public static int secondSmallest(int[] x) {
		// Your code
//		if(x.length<=1)
//			return (0);
//		int smallest=x[0];
//		int secondSmallest=x[1];
//		
//		for(int val:x) 
//		{
//			if(val<smallest)
//				smallest=val;
//			if(val<secondSmallest && val>smallest)
//				secondSmallest=val;
//				
//		}
//		int smallest=x[0];
//		int secondsmallest=x[1];
		int small=Integer.MAX_VALUE;
		int secsmall=Integer.MAX_VALUE;
		if(x.length<=1)
			return 0;
		for(int i=0;i<x.length;i++) {
			if(x[i]<small) {
				secsmall=small;
				small=x[i];
			}
			if(x[i]<secsmall && x[i]>small) {
				secsmall=x[i];
			}
			
		}
		
		
	//	System.out.println(secsmall);
		return secsmall;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0 };
		int[] b = { 0, 1 };

		boolean result = true;
		result &= secondSmallest(a) == 0;
		result &= secondSmallest(b) == 1;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
