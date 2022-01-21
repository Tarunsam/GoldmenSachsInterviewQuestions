package com.gs.ownpractice;
public class Decimal_Conversion {
	/**
	 * Return the fraction output in the following way Examples: If after decimal,
	 * repeating numbers are there in the output . eg. 1/3=0.333333333, this should
	 * be represented as 0.(3) 6/11=0.54545454, this should be represented as 0.(54)
	 * fractionRepresentation(1,2)=0.5 fractionRepresentation(1,3)=0.(3)
	 * fractionRepresentation(6,11)=0.(54)
	 */
	public static String fractionRepresentation(int num, int den) {
		float d = (float) num / (float) den;
		String str = String.valueOf(d);

		int decimal = str.indexOf(".");
		String st = str.substring(0, decimal + 1);
		String afterdecimal = str.substring(decimal + 1);

		String result = st;String intermediateSubString="";
		boolean isrepeated = false;
		
		if(afterdecimal.length()==1) {
			//System.out.println(afterdecimal.charAt(0));
			return result+afterdecimal.charAt(0);
		}
		
		else {
			
		int j=1;
		for(int i=0;i<afterdecimal.length();i++) {
			
			while(j<afterdecimal.length()) {
				
				if(afterdecimal.charAt(i)==afterdecimal.charAt(j)) 
				{ 
					isrepeated=true; 
					break;
				}
				j++;
			}
			
			  if(isrepeated) {
				  intermediateSubString=afterdecimal.substring(i, j);
				  break;
				  } 
			  }
		
		if (isrepeated) {
			result = result + "(" + intermediateSubString + ")";
		}		
		}
	//	System.out.println(result);
		return result;
	}

	public static void main(String args[]) {
		// float f=6/11f;
		// System.out.println(f);
		System.out.println(fractionRepresentation(1, 2) + " " + fractionRepresentation(1, 3) + " "
				+ fractionRepresentation(6, 11));

		if (fractionRepresentation(1, 2).equals("0.5") && fractionRepresentation(6, 11).equals("0.(54)")
				&& fractionRepresentation(1, 3).equals("0.(3)")) {
			System.out.println("All passed");
		} else {
			System.out.println("Failed");
		}

	}
}