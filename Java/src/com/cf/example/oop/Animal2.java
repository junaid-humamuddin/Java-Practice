package com.cf.example.oop;

class Animal2 {
	public void eat() throws Exception {
		// throws an Exception
	}
}
class Dog2 extends Animal2 {
	public void eat() { /* no Exceptions */}
	public static void main(String [] args) {
//		Animal2 a = new Dog2();
//		Dog2 d = new Dog2();
//			d.eat(); // ok
//			a.eat(); // compiler error -
			// unreported exception
	}
}
