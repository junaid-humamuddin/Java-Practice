package com.cf.example.oop;

public class Animals {
	 String name;
	 
	 Animals(String name) {
	 this.name = name;
	 	}

	 Animals() {
	 this(makeRandomName());
 		}

 	static String makeRandomName() {
 		int x = (int) (Math.random() * 5);
 		String name = new String[] {"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
 		return name;
 		}

 	public static void main (String [] args) {
 		Animals a = new Animals();
 		System.out.println(a.name);
 		Animals b = new Animals("Zeus");
 		System.out.println(b.name);
 	}
 }
