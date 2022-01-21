package com.gs.ownpractice;

// find the median of the two sorted arrays.
 // ex. {1, 3} and {2} is 2


public class MedianTwoSortedArrays
{

  public static double logic(int[] a, int[] b) {
	  int begin=0;
      int end=a.length;
      
      while(begin<=end){
          
          int aleft=(begin+end)/2;
          int bleft=((a.length+b.length+1)/2)-aleft;
          
          int aleftminus1=(aleft==0) ? Integer.MIN_VALUE : a[aleft-1];
          int alft=(aleft==a.length) ? Integer.MAX_VALUE : a[aleft];
          int bleftminus1=(bleft==0) ? Integer.MIN_VALUE : b[bleft-1];
          int blft=(bleft==b.length) ? Integer.MAX_VALUE : b[bleft];
          
          if(aleftminus1 <=blft && bleftminus1<=alft){
          
              if((a.length+b.length)%2==0)
                  return (Math.max(aleftminus1,bleftminus1)+Math.min(alft,blft))/2.0;
              else
                 return Math.max(aleftminus1,bleftminus1);
          }
          else if (aleftminus1>blft){
              end=aleft-1;
          }else{
              begin=aleft+1;
          }
  
      }
      
      return 0;
  }

  /* {2, 3, 5, 8}  
   * {10, 12, 14, 16, 18, 20}
   * 
   * 
   */
  
  
  
  public static boolean pass()
  {
  boolean result = true;
//  result = result && logic(new int[]{2, 3, 5, 8}, new int[]{10, 12, 14, 16, 18, 20}) == 11.0;
//  result = result && logic(new int[]{-5, 3, 6, 12, 15}, new int[]{-12, -10, -6, -3, 4, 10}) == 3.0;
//  result = result && logic(new int[]{2, 3, 5, 8}, new int[]{10, 12, 14, 16, 18, 20}) == 11.0;
  result = result && logic(new int[]{1, 3}, new int[]{0}) == 1.0;
 // result = result && logic(new int[]{}, new int[]{5,8,10,20}) == 9.0;
  return result;
  };

  public static void main(String[] args)
  {
  if(pass())
  {
    System.out.println("pass");
  }
  else
  {
    System.out.println("some failures");
  }
  }
}