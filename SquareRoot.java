package com.gs.ownpractice;

public class SquareRoot {

	public static double squareRoot( double x )
	  {
	    double temp=1;

		double sr = x / 2;

		do {
			temp = sr;
			sr = (temp + (x / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	  }


	  public static void main( String args[])
	  {
	    double[] inputs = {2, 4, 100};
	    double[] expected_values = { 1.41421, 2, 10 };
	    double threshold = 0.001;
	    for(int i=0; i < inputs.length; i++)
	    {
	      if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
	      {
	        System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
	      }
	    }
	    System.out.println( "All tests passed");
	  }
}
