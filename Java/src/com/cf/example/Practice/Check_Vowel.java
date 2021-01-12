package com.cf.example.Practice;

import java.util.Scanner;

public class Check_Vowel {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		x = sc.nextInt();
		if (x == 'a' || x == 'A' || x == 'e' || x == 'E' || x == 'I' || x == 'i' || x == 'o' || x == 'O' || x == 'u'
				|| x == 'U') {
			System.out.println("vowel");
		} else {
			System.out.println("Consonent");
		}
	}

}
