package journal.dev;

public class SuperParentConstructor {
	private int age;

	public SuperParentConstructor() {
		System.out.println("SuperParentConstructor Created");
	}

	public SuperParentConstructor(int i) {
		this.age = i;
		System.out.println("SuperParentConstructor Created with Age = " + i);
	}
}
