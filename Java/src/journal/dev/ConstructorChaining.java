package journal.dev;

public class ConstructorChaining {

	private int id;
	private String name;

	public ConstructorChaining() {
		this("John Doe", 999);
		System.out.println("Default Employee Created");
	}

	public ConstructorChaining(int i) {
		this("John Doe", i);
		System.out.println("Employee Created with Default Name");
	}

	public ConstructorChaining(String s, int i) {
		this.id = i;
		this.name = s;
		System.out.println("Employee Created");
	}

	public static void main(String[] args) {

		ConstructorChaining emp = new ConstructorChaining();
		System.out.println(emp);
		ConstructorChaining emp1 = new ConstructorChaining(10);
		System.out.println(emp1);
		ConstructorChaining emp2 = new ConstructorChaining("Pankaj", 20);
		System.out.println(emp2);
	}

	@Override
	public String toString() {
		return "ID = " + id + ", Name = " + name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
