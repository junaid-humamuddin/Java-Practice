package com.cf.example.Practice;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		int count = 0, n;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("number of digits=" + count);
	}
}
