package com.cf.example.Practice;

import java.util.*;

public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.addFirst("first");
		ll.addLast("last");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
