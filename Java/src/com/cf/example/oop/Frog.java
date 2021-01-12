package com.cf.example.oop;

class Frog {
	int frogSize = 0;
	
	public Frog(int s) {
		frogSize = s;
	}
	public int getFrogSize() {
	return frogSize;
	}
	
	public static void main (String [] args) {
	Frog f = new Frog(25);
	System.out.println(f.getFrogSize()); // Access instance
	// method using f
	}
}
