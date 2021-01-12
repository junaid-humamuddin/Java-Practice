package com.cf.example.rough;

public class StaricVarMtdTest_sameClass {
	
	static int size = 7;
	static void changeIt(int size) {
	size = size + 200;
	System.out.println("size in changeIt is " + size);
	}
	
	public static void main(String[] args) {
		
		changeIt(size);
		
	}

}
