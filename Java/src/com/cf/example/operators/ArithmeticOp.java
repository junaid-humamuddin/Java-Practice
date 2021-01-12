package com.cf.example.operators;

	public class ArithmeticOp {
		public void result() {
			int a=10;  
			int b=5;  
			System.out.println(a+b);//15  
			System.out.println(a-b);//5  
			System.out.println(a*b);//50  
			System.out.println(a/b);//2  
			System.out.println(a%b);//0  

		}
	public static void main(String[] args) {
		ArithmeticOp a1=new ArithmeticOp();
		a1.result();
	}
}