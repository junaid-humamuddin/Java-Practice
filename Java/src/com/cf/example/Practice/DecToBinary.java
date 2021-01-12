package com.cf.example.Practice;

import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {
		int num, temp;
		int result=0;
		//int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		num=sc.nextInt();
		/*//System.out.println(number);
		quo1=number/2;
		//System.out.println(quo); //quo1=3 for 6
		rem1=number%2;
		//System.out.println(rem1); //rem1=0 for 6
		quo2=quo1/2;
		//System.out.println(quo2); //quo2=1 for quo1
		rem2=quo1%2;
		//System.out.println(rem); //rem for quo1
		System.out.println(rem2+""+quo2+""+rem1);
		sc.close();*/
		while(num!=0) {
		temp=num;
		temp=num%2;
		num=num/2;
		result=(result*10)+temp;
		//count++;
		}
		/*if(count<2)
		System.out.println("000"+result);
		else if(count<3)
			System.out.println("00"+result);
		else if(count<4)
			System.out.println("0"+result);
		else*/
			System.out.println(result);
	}

}
