package journal.dev;

public class ParamDataConstructor {

	private String name;

	public ParamDataConstructor(String n) {
		System.out.println("Parameterized Constructor");
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ParamDataConstructor d = new ParamDataConstructor("Java");
		System.out.println(d.getName());
	}
}
