package com.cf.example.regex;

import java.util.Scanner;

/*
 * This is an example source code that prints the delimiter
 * and print the string tokens
 */

public class ScannerDelimiter {

	public static void main(String[] args) {

		// Initialize Scanner object
		Scanner scan = new Scanner("This an example string");
		// Printing the delimiter used
		System.out.println("Delimiter:" + scan.delimiter());
		// Printing the tokenized Strings
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		// closing the scanner stream
		scan.close();

	}

}