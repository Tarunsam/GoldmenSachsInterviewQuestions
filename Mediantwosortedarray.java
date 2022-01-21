package com.gs.ownpractice;

//find the median of the two sorted arrays.
// ex. {1, 3} and {2} is 2

/*
 * A={1,2,3} B={4,5,6,7}
 * c={1,2,3,4,5,6,7} median(O)= middle element even = mid+mid+1/2
 * 
 */
public class Mediantwosortedarray {

	 public static double logic(int[] A, int[] B) {
		 int i=0;int j=0;int k=0;
		 int[] c=new int[A.length+B.length];
		 while(i<A.length & j<B.length) {
			 if(A[i]<B[j]) {
				 c[k]=A[i];
				 i++;k++;
			 }
			 else {
				 c[k]=B[j];
				 j++;k++;
			 }
		 }
		 
		 while(i<A.length)
			 c[k++]=A[i++];
		 while(j<B.length)
			 c[k++]=B[j++];
		 
//		 for(int x:c)
//			 System.out.println(x);
		 
		 int length=c.length;double pos = 0;
		 System.out.println(length);
		 if(length%2==0) {
			 System.out.println(c[(length/2)-1]+" : "+c[((length+2)/2)-1]);
			 
			 pos=(c[(length/2)-1]+c[((length+2)/2)-1])/2.0;
			 System.out.println(pos);
		 	  return pos;
		 }			 
		 else {
			 pos=c[((length+1)/2)-1];System.out.println(pos);
		 	 return pos;
		 }
		  //your code
		  }

		  public static boolean pass()
		  {
		  boolean result = true;
		//  result = result && logic(new int[]{1, 3,5}, new int[]{2, 4}) == 3.0;
		  result = result && logic(new int[]{2, 3, 5, 8}, new int[]{10, 12, 14, 16, 18, 20}) == 11.0;
		  
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
