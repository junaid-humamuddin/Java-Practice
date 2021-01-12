package com.cf.example.CollectionsPractice;

import java.util.Hashtable;

public class Hashtable_Ex {

	public static void main(String[] args) {
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(1, "Junaid");
		ht.put(2, "zain");
		ht.put(3, "abc");
		System.out.println(ht);
		System.out.println("isEmpty "+ht.isEmpty());
		System.out.println("Contains key-2 "+ht.containsKey(2));
		System.out.println(ht.containsValue("abc"));
		boolean ht1=ht.replace(3, "abc", "ABC");
		System.out.println(ht1);
		System.out.println(ht);
	}

}
