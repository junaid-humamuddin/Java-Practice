package com.cf.example.Practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int[] array1 = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. Square");
		System.out.println("4. SquareRoot");
		System.out.println("Enter the type of operation");
		int op = sc.nextInt();
		outer: 
		switch (op) {
		case 1:
			System.out.println("Enter the no of values to be added ");
			int valueAdd=sc.nextInt();
			int add = 0;
			System.out.println("Enter "+valueAdd+" Values");
			for (int i = 0; i < valueAdd; i++) {
				array1[i] = sc.nextInt();
				add=add+array1[i];
			}
			System.out.println("Addition of numbers is " + add);
			break outer;
		case 2:
			System.out.println("Enter the no of values to be Subtracted ");
			int valueSub=sc.nextInt();
			int sub = 0;
			System.out.println("Enter "+valueSub+" Values");
			for (int i = 0; i < valueSub; i++) {
				array1[i] = sc.nextInt();
				sub=sub-array1[i];		
				if(sub<0) {
					sub=(-sub);
				}
				
			}
			System.out.println("subtraction of numbers is " + sub);
			break outer;
		case 3:
			System.out.println("Enter the number for its square");
			int sq=sc.nextInt();
			System.out.println("Square of a number is "+sq*sq);
			break outer;
		default:
			System.out.println("Under construction");
		}
		sc.close();

	}

}
