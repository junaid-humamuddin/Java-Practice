package com.cf.example.Collections;

import java.util.*;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> iL = new ArrayList<Integer>();
		for(int x=0; x<3; x++)
		iL.add(x);
		/*Object[] oa = iL.toArray();*/ // create an Object array
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2); // create an Integer array
		//System.out.println(oa);
		System.out.println(ia2);
		for (Integer o : ia2) {	
			System.out.println(o);
		}
	}
}
