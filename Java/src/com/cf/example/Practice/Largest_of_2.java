package com.cf.example.Practice;

import java.util.Scanner;

public class Largest_of_2 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		x=sc.nextInt();
		System.out.println("Enter Second number");
		y=sc.nextInt();
		if(x>y) {
			System.out.println("Value "+x +" is greater than "+y);
		}
		else {
			System.out.println("Value "+y +" is greater than "+x);
			
		}
	}

}
