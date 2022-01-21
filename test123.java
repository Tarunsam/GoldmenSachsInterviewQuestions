package com.gs.ownpractice;

class A{
	A(){
		
		greeting();read();
	}
	
	void greeting() {}
	void read() {}
	
}




public class test123 extends A {
	
	test123(){
		greeting();read();
	}

	void greeting() {}
	void read() {}
	
	public static void main(String[] args) {
		new test123().greeting();
	}
}
