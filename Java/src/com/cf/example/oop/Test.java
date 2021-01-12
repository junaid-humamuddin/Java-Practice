package com.cf.example.oop;

class Test {
public static void main(String [] args) {
Test t1 = new Test();
Test t2 = new Test();
if (!t1.equals(t2))
System.out.println("they're not equal");
if (t1 instanceof Object)
	/*Hold on…how can t1 be an instance of type Object, we just said it was of type
	Test? I'm sure you're way ahead of us here, but it turns out that every class in Java is
			a subclass of class Object */
System.out.println("t1's an Object");
}
}