package com.cf.example.assignments;

public  class Initialization_Blocks {

	Initialization_Blocks(int x) { System.out.println("1-arg const"); }

	Initialization_Blocks() { System.out.println("no-arg const"); }

	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {

		new Initialization_Blocks();
		new Initialization_Blocks(7);

	}

}

/*To figure this out, remember these rules:
Init blocks execute in the order they appear.
Static init blocks run once, when the class is first loaded.
Instance init blocks run every time a class instance is created.
Instance init blocks run after the constructor's call to super().
*/