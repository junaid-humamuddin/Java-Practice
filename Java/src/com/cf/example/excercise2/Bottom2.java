package com.cf.example.excercise2;

class Top {
	public Top(String s) { 
		System.out.print("B"); 
		}
}

public class Bottom2 extends Top {
	public Bottom2(String s) { 
		super(s);
		// TODO need to call super as above or else will give compile time error
		System.out.print("D"); 
		}
	
	public static void main(String [] args) {
		new Bottom2("C");
		System.out.println(" ");
	} 
}