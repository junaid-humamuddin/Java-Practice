/*There are two cases:

    Case1:You caught the exception i.e. handle the exception using try/catch.
    Case2:You declare the exception i.e. specifying throws with the method.*/

//Case1: You handle the exception

package com.cf.example.exceptions;

import java.io.*;

class M {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Testthrows2 {
	public static void main(String args[]) {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}