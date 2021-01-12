package com.cf.example.assignments;

class Dimension {
	 int width;
	 int height;

	Dimension(int width, int height) {
		this.width=width;
		this.height=height;
		
	}
}
class ReferenceTest {
	
	public static void main (String [] args) {
		Dimension a = new Dimension(5,10);
		System.out.println("a.height = " + a.height);
		Dimension b = a;
		b.height = 30;
		System.out.println("a.height = " + a.height + " after change to b");
	}
}


/*
class Dimension {
	 int width;
	 int height;

	Dimension(int width, int height) {
		this.width=width;
		this.height=height;
		
	}
}
class ReferenceTest {
	
	void modify(Dimension dim) {
		dim.height = dim.height + 1;
		System.out.println("dim = " + dim.height);
	}
	public static void main (String [] args) { 
		Dimension d = new Dimension(5,10);
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() d.height = "
				+ d.height);
		rt.modify(d);
		System.out.println("After modify() d.height = "
				+ d.height);
		
		}
	

}

*/

/*

//Let's look at what happens when a primitive variable is passed to a method:
class ReferenceTest {
	public static void main (String [] args) {

		int a = 1;
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() a = " + a);
		rt.modify(a);
		System.out.println("After modify() a = " + a);
	}
	void modify(int number) {
		number = number + 1;
		System.out.println("number = " + number);
	}
}
*/