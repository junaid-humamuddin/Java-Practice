package com.cf.example.exceptions;

import java.io.*;

class Parent {
	void msg() {
		System.out.println("parent");
	}
}

class ExceptionChild extends Parent {
	void msg() throws ArithmeticException{
	//void msg() throws IOException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new ExceptionChild();
		p.msg();
	}
}
/*If the superclass method does not declare an exception, subclass overridden method 
cannot declare the checked exception but can declare unchecked exception. */