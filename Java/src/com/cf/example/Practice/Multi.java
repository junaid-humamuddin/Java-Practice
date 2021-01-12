package com.cf.example.Practice;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number for its multiplication");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=20;i++) {
			int sum=i*n;
			System.out.println(n+"*"+i+ "is=" +sum);
		}
		sc.close();

	}

}
