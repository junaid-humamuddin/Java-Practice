package com.cf.example.assignments;

// You can shadow an instance variable by declaring a local variable of the same name, either
//directly or as part of an argument:

 public class Foo {
	static int size = 7;
	static void changeIt(int size) {
	size = size + 200;
	System.out.println("size in changeIt is " + size);
	}
	public static void main (String [] args) {
		Foo f = new Foo();
		System.out.println("size = " + size);
		changeIt(size);
		System.out.println("size after changeIt is " + size);
	}
}
//The preceding code appears to change the size instance variable in the changeIt() method,
//but because changeIt() has a parameter named size, the local size variable is modified while
//the instance variable size is untouched. Running class Foo prints 
 
 


