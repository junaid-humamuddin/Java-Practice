package com.cf.example.CollectionsPractice;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("B");
		ts.add("D");
		ts.add("A");
		ts.add("D");
		ts.add("C");
		System.out.println(ts);
		System.out.println(ts.contains("B"));
	}

}
