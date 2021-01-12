package com.cf.example.rough;

public class WhileTest {

	public static void main(String[] args) {
		// this assignment of value in while loop expression is only valid for boolean
		// or Boolean
		// not for any other primitive
		boolean x = false;
		while (x = true) {
			System.out.println(x);

		}

	}

}
