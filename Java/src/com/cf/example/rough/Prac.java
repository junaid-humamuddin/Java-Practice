package com.cf.example.rough;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		age=sc.nextInt();
		outer:
			while(age<=21) {
				
				if(age==16) {
					System.out.println("get your drivers licence");
					age++;
					continue outer;
				}
				else
				{
					
					System.out.println("Another Year");
					break;
					
					
				}
				
			}
		sc.close();
	}

}
