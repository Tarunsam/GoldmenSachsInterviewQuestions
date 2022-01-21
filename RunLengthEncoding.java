package com.gs.ownpractice;

public class RunLengthEncoding {


		  public static String rle(String input) {
		    // Your code goes here
			  StringBuilder sb=new StringBuilder();
			//char[] ch=input.toCharArray();
			if(input=="") {
				return "";
			}
			else {
			for(int i=0;i<input.length();i++){
				int count=1;
				while(i<input.length()-1 && input.charAt(i)==input.charAt(i+1)){
		            count++;i++;
		        }
				sb.append(input.charAt(i));
				sb.append(count);
			}
			System.out.println(sb);
		    return sb.toString();
		  }
		 }

		  
	public static void main(String[] args)  {
	    
		  if("".equals(rle("")) && 
				  "a1".equals(rle("a")) && 
				  "a3".equals(rle("aaa"))){
			  System.out.println("Passed");
		  }else {
			  System.out.println("Failed");
		  }
	  }
}
