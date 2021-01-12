package com.cf.example.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingInCollections {

	public static void main(String[] args) {
		/*ArrayList<String> list=new ArrayList<>();
		list.add("G");
		list.add("D");
		list.add("A");
		list.add("R");
		System.out.println("Before sort "+list);
		Collections.sort(list);
		System.out.println("After sort"+list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String s:list) {
			System.out.println(s);
		}*/
		//sorting using wrapper class objects
		ArrayList<Integer> alist=new ArrayList<>();
		int a1=Integer.valueOf(101);
		alist.add(a1);
		alist.add(Integer.valueOf(99));
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);

	}

}
