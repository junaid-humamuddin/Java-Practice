package com.cf.example.oop;

	interface Bounceable extends Moveable, Spherical { // ok!
		void bounce();
		void setBounceFactor(int bf);
	}
	interface Moveable {
		void moveIt();
	}
	interface Spherical {
		void doSphericalThing();
	}

class Ball implements Bounceable {
	public void bounce() {
		
	} // Implement Bounceable's methods
	public void setBounceFactor(int bf) {
		
	}
	public void moveIt() { 
		
	} // Implement Moveable's method
	public void doSphericalThing() { 
		
	} // Implement Spherical
}