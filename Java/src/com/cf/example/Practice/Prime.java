package com.cf.example.Practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int i, no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to check Prime");
		no = sc.nextInt();

		/*
		 * if (no % no == 0 && no % 2 != 0 && no % 3 != 0) {
		 * System.out.println("prime"); } else { System.out.println("not prime"); }
		 */

		for (i = 2; i < no; i++) {
			if (no % i == 0) {
				System.out.println("Not a Prime No");
				break;
			}
		}
		if(no==i)
		System.out.println("prime");

	}
}
