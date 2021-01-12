package com.cf.example.oop;

class Animal3 { 
	
}
class Horse3 extends Animal3 {
	
}
class UseAnimals {
	
	public void doStuff(Animal3 a) {
		System.out.println("In the Animal version");
	}
	
	public void doStuff(Horse3 h) {
		System.out.println("In the Horse version");
	}
	
	public static void main (String [] args) {
		UseAnimals ua = new UseAnimals();
		Animal3 animalObj = new Animal3();
		Horse3 horseObj = new Horse3();
		Animal3 animalRefToHorse = new Horse3();
		
		ua.doStuff(animalObj);
		ua.doStuff(horseObj);
		ua.doStuff(animalRefToHorse);
	}
}