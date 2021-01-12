package com.cf.example.Practice;

import java.util.Scanner;

public class SumOfDigitsInNumbers {

	public static void main(String[] args) {
		int count = 0,r;
	    long n;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n > 0) {
			//r = n % 10;
			n = n / 10;
			count = count + 1;
		}
		System.out.println("sum of digits is" + count);
		sc.close();
	}
}