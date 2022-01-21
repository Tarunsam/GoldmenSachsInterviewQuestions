package com.gs.ownpractice;

/*
 * Max area=l*b
 * 
 * **             ___                |   |        ___
**            |   | *   *  _*_  * |   |_*_  * |   |
**         ___|   | *  _*_|   | * |   |   | * |   |
**     ___|___|___|_*_|___|___|_*_|___|___|_*_|___|___
**     {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
 */



public class MaximumWaterarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0};
		
		int area=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				
				area=Math.max(area,((j-i)*Math.min(a[i], a[j])));
			}
		}
		System.out.println("Max area:"+area);

	}

}
