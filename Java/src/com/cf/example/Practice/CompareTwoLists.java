package com.cf.example.Practice;

import java.util.*;

public class CompareTwoLists {

	static boolean compareList(List<String> list1, List<String> list2) {
		//list1.toString().equalsIgnoreCase(list2.toString());
		return list1.toString().contentEquals(list2.toString()) ? true : false;
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("john");
		list1.add("smith");
		list1.add("taylor");
		// System.out.println(list1);
		Collections.sort(list1);
		
		/*String[] arrayList1=(String[]) list1.toArray();
		for(String s:arrayList1) {
			System.out.println(s);
		}*/
		/*for(int i=0;i<list1.size();i++) {
			String[] lst1=(String[]) list1.toArray();
			System.out.println(lst1);
		}*/
		
		
		Iterator<String> i1 = list1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		// System.out.println(list1);
		System.out.println();
		List<String> list2 = new ArrayList<String>();
		list2.add("smith");
		list2.add("taylor");
		list2.add("john");
		// System.out.println(list2);
		Collections.sort(list2);
		// System.out.println(list2);
		Iterator<String> i2 = list2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println();
		System.out.println("Result Compared is");
		System.out.println(compareList(list1, list2));
	}

}
