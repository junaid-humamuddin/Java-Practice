package journal.dev;

public class TestStatic {

	public static void main(String[] args) {
		StaticExample2.setCount(5);

		// non-private static variables can be accessed with class name
		StaticExample2.str = "abc";
		StaticExample2 se = new StaticExample2();
		System.out.println(se.getCount());
		// class and instance static variables are same
		System.out.println(StaticExample2.str + " is same as " + se.str);
		System.out.println(StaticExample2.str == se.str);

		// static nested classes are like normal top-level classes
		StaticExample2.MyStaticClass myStaticClass = new StaticExample2.MyStaticClass();
		myStaticClass.count = 10;

		StaticExample2.MyStaticClass myStaticClass1 = new StaticExample2.MyStaticClass();
		myStaticClass1.count = 20;

		System.out.println(myStaticClass.count);
		System.out.println(myStaticClass1.count);
	}

}
