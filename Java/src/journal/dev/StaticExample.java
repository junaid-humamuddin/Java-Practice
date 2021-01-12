package journal.dev;

import static journal.dev.A.MAX;
import static journal.dev.A.foo;

class Test {
	static int i;
	int j;

	// start of static block
	// Static block is used to initialize the static variables of the class.
	// Mostly it’s used to create static resources when the class is loaded.
	static {
		i = 10;
		System.out.println("static block called ");
	}
	// end of static block
}

class Geek {

	public static String geekName = "";

	public static void geek(String name) {

		geekName = name;
	}
}

class A {
	public static int MAX = 1000;

	public static void foo() {
		System.out.println("foo static method");
	}
}

public class StaticExample {

	public static void main(String[] args) {
		System.out.println(Test.i);

		System.out.println("----------------------------------------");
		
		// Accessing the static method geek() and
		// field by class name itself.
		Geek.geek("vaibhav");
		System.out.println(Geek.geekName);

		// Accessing the static method geek() by using Object's reference.
		Geek obj = new Geek();
		obj.geek("mohit");
		System.out.println(obj.geekName);
		
		System.out.println("----------------------------------------");
		
		System.out.println(MAX); // normally A.MAX
		foo(); // normally A.foo()

	}

}
