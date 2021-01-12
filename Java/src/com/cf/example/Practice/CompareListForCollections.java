package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.List;

public class CompareListForCollections {

	public static boolean compareList(List<String> ls1, List<String> ls2) {
		return ls1.containsAll(ls2) && ls1.size() == ls2.size() ? true : false;
	}

	public static void main(String[] args) {

		ArrayList<String> one = new ArrayList<String>();
		one.add("one");
		one.add("two");
		one.add("six");

		ArrayList<String> two = new ArrayList<String>();
		two.add("one");
		two.add("six");
		two.add("two");

		System.out.println("Output1 :: " + compareList(one, two));

		two.add("ten");

		System.out.println("Output2 :: " + compareList(one, two));
	}

}
