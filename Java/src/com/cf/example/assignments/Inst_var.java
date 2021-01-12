package com.cf.example.assignments;

public class Inst_var {
	int year; // Instance variable
	public static void main(String [] args) {
		Inst_var i = new Inst_var();
		i.showYear();
	}
	public void showYear() {
		System.out.println("The year is " + year);
	}
}

//When the program is started, it gives the variable year a value of zero, the default
//value for primitive number instance variables.