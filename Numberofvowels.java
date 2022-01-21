package com.gs.ownpractice;

public class Numberofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="qwerty";
		int count=0;
		char[] ch=str.toCharArray();
		
		for(char c:ch) {
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println("Number of vowels:"+count);

	}

}
