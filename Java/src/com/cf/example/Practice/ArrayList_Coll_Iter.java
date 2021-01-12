package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Coll_Iter {
	//Java ArrayList class can contain duplicate elements.
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");// Adding object in arraylist
		list.add("def");
		list.add("ghi");
		list.add("def");
		list.add("xyz");
		Iterator<String> itr = list.iterator(); // Traversing list through Iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
