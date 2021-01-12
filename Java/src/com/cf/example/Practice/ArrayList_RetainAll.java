package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_RetainAll {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("john");
		a1.add("smith");
		a1.add("adam");
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("joseph");
		a2.add("steve");
		a2.add("john");
		System.out.println("First List :" + a1);
		System.out.println("Second List :" + a2);
		a1.retainAll(a2);
		Iterator<String> i = a1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}
