package com.cf.example.excercise2;

class Building {
	Building() { 
		System.out.print("b "); 
		}
	Building(String name) {
		this(); 
		/*
“this” keyword can be used inside the constructor to call another overloaded constructor 
in the same Class.
		 */
		 
		System.out.print("bn " + name);
	}
}

public class House extends Building {
	House() { 
		System.out.print("h "); 
		}
	House(String name) {
		this(); 
		System.out.print("hn " + name);
	}
	public static void main(String[] args) { 
		new House("x "); 
		}
}
