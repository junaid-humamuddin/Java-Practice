package com.cf.example.Practice;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for its Division with given number");
		int no=sc.nextInt();
		System.out.println("Enter divisor for a given number");
		int div=sc.nextInt();
		System.out.println("The result is");
		if(no!=0) {
			int quotient=no/div;
			System.out.println(quotient);
		}
		sc.close();

	}

}
