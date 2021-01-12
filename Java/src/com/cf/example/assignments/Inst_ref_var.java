package com.cf.example.assignments;

public class Inst_ref_var {
	private String title; // instance reference variable
	public String getTitle() {
		return title;
	}
	public static void main(String [] args) {
		Inst_ref_var b = new Inst_ref_var();
		System.out.println("The title is " + b.getTitle());
	}
}