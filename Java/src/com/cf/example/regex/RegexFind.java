package com.cf.example.regex;

import java.util.regex.*;

public class RegexFind {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab"); // the expression
		Matcher m = p.matcher("abaaaba"); // the source
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
	}

}
