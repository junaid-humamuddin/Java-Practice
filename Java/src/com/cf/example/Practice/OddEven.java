package com.cf.example.Practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Test t=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		t.validate(no);

	}

}

class Test{
	void validate(int n) {
		if(n%2==0) {
			System.out.println("Even Number");
		}
		
		else {
			System.out.println("Odd Number");
		}
	}
}