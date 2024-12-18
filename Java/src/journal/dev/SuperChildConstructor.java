package journal.dev;

public class SuperChildConstructor extends SuperParentConstructor {

	private String name;

	public SuperChildConstructor() {
		System.out.println("SuperChildConstructor Created");
	}

	public SuperChildConstructor(int i, String n) {
		super(i); // super class constructor called
		this.name = n;
		System.out.println("SuperChildConstructor Created with name = " + n);
	}

	public static void main(String[] args) {
		//SuperChildConstructor st = new SuperChildConstructor();
		SuperChildConstructor st = new SuperChildConstructor(25, "junaid");
		System.out.println(st.name);
		
	}
}
