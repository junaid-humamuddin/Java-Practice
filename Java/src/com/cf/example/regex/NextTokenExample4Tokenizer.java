package com.cf.example.regex;

import java.util.*;

public class NextTokenExample4Tokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my,name,is,khan");

		// printing next token
		System.out.println("Next token is : " + st.nextToken("is"));
	}
}