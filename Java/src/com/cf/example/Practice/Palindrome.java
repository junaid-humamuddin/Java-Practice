package com.cf.example.Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n, temp, r, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for palindrome");
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
