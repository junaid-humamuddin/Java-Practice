package com.cf.example.oop;

class Animal4 {
	void makeNoise() {
		System.out.println("generic noise"); 
		}
}
class Dog extends Animal4 {
	void makeNoise() {
		System.out.println("bark"); 
		}
	void playDead() { 
		System.out.println("roll over"); 
		}
}
class CastTest2 {
	public static void main(String [] args) {
		Animal4 [] a = {new Animal4(), new Dog(), new Animal4() };
		for(Animal4 animal4 : a) {
			animal4.makeNoise();
/*			if(animal4 instanceof Dog) {
				animal4.playDead(); // try to do a Dog behavior ?     
				}
				*/
			if(animal4 instanceof Dog) {
				Dog d = (Dog) animal4; // casting the ref. var.
				d.playDead();
				}
				
				
				
}
}
}
