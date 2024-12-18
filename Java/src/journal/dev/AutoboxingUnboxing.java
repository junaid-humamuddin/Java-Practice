package journal.dev;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {

	public static void main(String[] args) {

		Integer a = new Integer("456");
		int b = Integer.parseInt("456");
		System.out.println(a);
		System.out.print(b);

		int i = 5;
		long j = 105L;

		// passed the int, will get converted to Integer object at Runtime using
		// autoboxing in java
		doSomething(i);

		List<Long> list = new ArrayList<>();

		// java autoboxing to add primitive type in collection classes
		list.add(j);
	}

	private static void doSomething(Integer in) {
		// unboxing in java, at runtime Integer.intValue() is called implicitly to
		// return int
		int j = in;
		System.out.println(j);

		// java unboxing, Integer is passed where int is expected
		doPrimitive(in);
	}

	private static void doPrimitive(int i) {
		System.out.println(i);
	}
}