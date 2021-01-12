package com.cf.example.Practice;

import java.util.*;

public class Iterator_Fwd_Bkwd {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Amit");
		list.add("Vijay");
		list.add("Kumar");
		list.add(1, "Sachin");
		System.out.println("element at 2nd position: " + list.get(2));
		ListIterator<String> itr = list.listIterator();
		System.out.println("traversing elements in forward direction...");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing elements in backward direction...");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
