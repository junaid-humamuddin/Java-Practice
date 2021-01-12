package com.cf.example.CollectionsPractice;

import java.util.*;
//List Interface is a factory of ListIterator interface.(implementation is in linkedlist.java)
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		//System.out.println(arrayList.get(1));
		/*Iterator<String> itrArray=arrayList.iterator();
		{
			while(itrArray.hasNext()) {
				System.out.println(itrArray.next());
			}
		}*/
		/*for(String result:arrayList) {
			System.out.println(result);
		}*/
		/*arrayList.remove(0);
		System.out.println(arrayList);*/
		arrayList.add(2, "C");
		//System.out.println(arrayList);
		arrayList.set(2, "D");
		System.out.println(arrayList);
		int size=arrayList.size();
		System.out.println(size);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("Y");
		list2.add("Z");
		System.out.println(list2);
		/*arrayList.addAll(list2);
		System.out.println(arrayList);
		// //'y with removeAll;*/		
		arrayList.retainAll(list2);
		System.out.println(arrayList);
		int size1=arrayList.size();
		System.out.println(size1);
		
	}

}
