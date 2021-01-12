package journal.dev;

public class PrivateConstructor {

	// The private constructor is useful in case we want to restrict the object
	// creation.
	// For example, Singleton pattern can be implemented using a private
	// constructor.
	private static PrivateConstructor instance;

	private PrivateConstructor() {
	}

	public static PrivateConstructor getInstance() {
		if (instance == null) {
			instance = new PrivateConstructor();
		}
		return instance;
	}

	public static void main(String[] args) {
		PrivateConstructor tester = PrivateConstructor.getInstance();
		PrivateConstructor tester1 = PrivateConstructor.getInstance();
		System.out.println(tester.equals(tester1));
	}

}
