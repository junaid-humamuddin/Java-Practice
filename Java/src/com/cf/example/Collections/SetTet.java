package com.cf.example.Collections;

import java.util.*;

public class SetTet {
	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		// insert code here
		Set s = new HashSet();
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		for (int x = 0; x < ba.length; x++)
			System.out.print(ba[x] + " ");
		System.out.println("\n");
		for (Object o : s)
			System.out.print(o + " ");
	}
}