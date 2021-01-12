package com.cf.example.regex;

import java.util.*;

class SplitTest {
	public static void main(String[] args) {
		
		String s = "ab5 ccc 45 @";
		String[] tokens = s.split("\\d");
		
		System.out.println("count " + tokens.length);
		for (String s1 : tokens)
			System.out.println(">" + s1 + "<");
	}
}
//use "ab5 ccc 45 @"
/*import java.util.*;

class SplitTest {
	public static void main(String[] args) {
		String[] tokens = args[0].split(args[1]);
		System.out.println("count " + tokens.length);
		for (String s : tokens)
			System.out.println(">" + s + "<");
	}
}
*/