package com.cf.example.excercise2;

class X { 
	void do1() {
		
	} 
	void do2() { 
		System.out.println("y");
	} 
}
class Y extends X { 
	void do2() { 
		System.out.println("y");
	} 
}

class Chrome {
	public static void main(String [] args) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		// insert code here
		x2.do2();
	}
 }