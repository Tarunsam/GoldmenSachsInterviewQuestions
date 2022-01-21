package com.gs.ownpractice;

public class SubArrayExceedingSum {

	public static int subArrayExceedsSum(int arr[], int target )
	  {
		int min_len = arr.length + 1;
		int sum=0;
		for(int x:arr) {
			sum+=x;
		}
		if(sum<target) {
			return -1;
		}
		else
		{
        // Pick every element as starting point
        for (int start = 0; start < arr.length; start++)
        {
            // Initialize sum starting with current start
            int curr_sum = arr[start];

            // If first element itself is greater
            if (curr_sum > target)
                return 1;

            // Try different ending points for current start
            for (int end = start+1 ; end < arr.length; end++)
            {
                // add last element to current sum
                curr_sum += arr[end];

                // If sum becomes more than x and length of
                // this subarray is smaller than current smallest
                // length, update the smallest length (or result)
                if (curr_sum > target && (end - start + 1) < min_len)
                    min_len = (end - start + 1);
            }
        }
        System.out.println(min_len);
        return min_len;
		}
	  }

	  /**
	   * Execution entry point.
	  */
	  public static void main(String[] args)
	  {
	   boolean result = true; 
	  //int[] arr = { 1, 2, 3, 4 };
	   int[] arr= {1, 4, 45, 6, 0, 19};
	  result = result && subArrayExceedsSum( arr, 6 ) == 2;
	  result = result && subArrayExceedsSum( arr, 51 ) == 3;

	  if( result )
	  {
	    System.out.println("All tests pass\n");
	  }
	  else
	  {
	    System.out.println("There are test failures\n");
	  }
	  }
}
