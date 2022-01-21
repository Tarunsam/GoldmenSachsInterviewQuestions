package com.gs.ownpractice;

public class Is_PowerOf10 {

	public static boolean isPowerOf10(int input) {
		// your code goes here 100
		while (input % 10 == 0) {
			input /= 10;
		}	
		return input == 1;
		
	}

	public static boolean doTestsPass() {
		int[] isPowerList = { 1000 };
		int[] isNotPowerList = { 34 };

		for (int i : isPowerList) {
			if (!isPowerOf10(i)) {
				System.out.println("Test failed for: " + i);
				return false;
			}
		}

		for (int i : isNotPowerList) {
			if (isPowerOf10(i)) {
				System.out.println("Test failed for: " + i);
				return false;
			}
		}

		System.out.println("All tested passed");
		return true;
	};

	public static void main(String args[]) {
		doTestsPass();
	}
}
