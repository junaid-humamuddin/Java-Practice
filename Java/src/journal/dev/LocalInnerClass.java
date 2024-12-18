package journal.dev;

public class LocalInnerClass {
	private String s_main_class = "Hi Main";

	public void print() {
		String s_print_method = "Hi print method called by subclass object - Local Inner Class";
		// local inner class inside the method
		class Logger {
			// able to access enclosing class variables
			String name = s_main_class;
			// able to access non-final method variables
			String name1 = s_print_method;

			public void foo() {
				String name1 = s_print_method;
				System.out.println(name1);
				// Below code will throw compile time error:
				// Local variable s_print_method defined in an enclosing scope must be final or
				// effectively final
				// s_print_method= ":";
			}
		}
		// instantiate local inner class in the method to use
		Logger logger = new Logger();
		logger.foo();

	}
	public static void main(String[] args) {
		LocalInnerClass localinnerClass = new LocalInnerClass();
		System.out.println(localinnerClass.s_main_class);
		localinnerClass.print();
		
	}
}
