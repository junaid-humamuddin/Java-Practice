package com.cf.example.exceptions;

class TestEx {
	public static void main(String[] args) {
		doStuff();
	}

	static void doStuff() {
		doMoreStuff();
	}
    static void doMoreStuff() {
		try {
			int x = 5 / 0; // Can't divide by zero!
			// ArithmeticException is thrown here
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

/*You can keep throwing an exception down through the methods on
the stack. But what about when you get to the main() method at the bottom? You can
throw the exception out of main() as well. This results in the Java Virtual Machine (JVM)
halting, and the stack trace will be printed to the output.*/