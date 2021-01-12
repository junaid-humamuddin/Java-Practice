package com.cf.example.CollectionsPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
	
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.addFirst("HMM");
		list.add(0, "Start");
		list.set(1, "go");
		list.offerFirst("ABC");
		list.offerLast("Stop");
		list.addLast("Z");
		//System.out.println(list);
		/*Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		ListIterator<String> itr=list.listIterator();  
		System.out.println("traversing elements in forward direction...");  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("traversing elements in backward direction...");  
		while(itr.hasPrevious()){  
		System.out.println(itr.previous());  
		}  

	}

}
