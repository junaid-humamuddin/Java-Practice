package com.cf.example.excercise2;

class AgedP {
AgedP() {
	System.out.println("AgedP without Args");
}
public AgedP(int x) {
	System.out.println("AgedP with Args");
}
}
public class Kinder extends AgedP {
	public Kinder(int x) {
		super(x);
		}
	public static void main(String[] args) {
		new Kinder(1);
	}

}