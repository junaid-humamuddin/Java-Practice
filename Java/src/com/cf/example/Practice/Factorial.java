package com.cf.example.Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Factor f = new Factor();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no to print its factorial");
		int no = sc.nextInt();
		f.test(no);

	}

}

class Factor {
	int i, fact = 1;

	void test(int n) {

		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is " + fact);
	}
}