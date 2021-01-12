package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class CompareTwoListsUsingComparator {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		a1.add("e");
		a2.add("a");
		a2.add("b");
		a2.add("c");

		for (int i = 0; i < a1.size(); i++) {
			String str1 = (String) a1.get(i);
			for (int j = 0; j < a2.size(); j++) {
				String str2 = (String) a2.get(j);
				// int result = str1.compareTo(str2);
				// if (result == 0)
				// System.out.println(str1+ " = " + str2);
				// else if (result > 0)
				// System.out.println(str1+ " > " + str2);
				if (str2.equalsIgnoreCase(str1))
					System.out.println(str1);

			}

		}
	}
}