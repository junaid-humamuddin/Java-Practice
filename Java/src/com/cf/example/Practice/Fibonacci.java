package com.cf.example.Practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Validate v = new Validate();
		v.test();
	}
}

class Validate {
	void test() {
		int n1=0, n2=1, n3, c = 10, i;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		for (i = 2; i < c; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
