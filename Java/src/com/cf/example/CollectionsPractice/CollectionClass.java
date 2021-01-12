package com.cf.example.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		System.out.println(list1);
		Collections.addAll(list1, "D", "E");
		System.out.println(list1);
		String[] arrlist = { "F", "G", "H" };
		Collections.addAll(list1, arrlist);
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(29);
		list2.add(81);
		list2.add(16);
		list2.add(4);
		System.out.println(list2);
		System.out.println(Collections.max(list2));
		System.out.println(Collections.min(list2));
		

	}

}
