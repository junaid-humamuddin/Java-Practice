package com.cf.example.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Details {
	int age;
	String name;

	public Details(int age, String name) {
		this.name = name;
		this.age = age;
	}
}

class NComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Details d1 = (Details) o1;
		Details d2 = (Details) o2;

		return d1.name.compareTo(d2.name);
	}
}

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Details> alist = new ArrayList<Details>();
		alist.add(new Details(22, "junaid"));
		alist.add(new Details(21, "zain"));
		Collections.sort(alist, new NComparator());
		Iterator<Details> itr = alist.iterator();
		while (itr.hasNext()) {
			Details d = itr.next();
			System.out.println(d.age + " " + d.name);
		}

	}

}
