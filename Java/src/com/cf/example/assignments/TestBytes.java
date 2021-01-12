package com.cf.example.assignments;

public class TestBytes {

	public static void main(String[] args) {
		byte a = 3; // No problem, 3 fits in a byte
		byte b = 8; // No problem, 8 fits in a byte
		//byte c = a + b;
		byte c = (byte) (a + b); // Should be no problem, sum of the two bytes
		// fits in a byte
		
		System.out.println("c value is " + c);
		byte x = (byte) 128;
		System.out.println("Byte x value is " + x);
	}

}
