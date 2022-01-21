package com.gs.ownpractice;

public class ReverseOfString {
	
	public static String reverseStr(String str) {
		// your code goes here

		String rev = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			rev += charArray[i];

		}
		return rev;
	}

	public static void main(String[] args) {

		String testString;
		String solution;
		boolean result = true;

		result = result && reverseStr("abcd").equals("dcba");

		if (result) {
			System.out.println("All tests pass");
		} else {
			System.out.println("There are test failures");
		}

	}
}
