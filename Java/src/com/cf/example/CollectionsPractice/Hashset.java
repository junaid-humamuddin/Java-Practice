package com.cf.example.CollectionsPractice;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
// linkededHashet is also similar
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("C");//duplicates are not allowed in set interface.
		//System.out.println(set);
		/*Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		for(String s:set) {
			System.out.println(s);
		}
	}

}
