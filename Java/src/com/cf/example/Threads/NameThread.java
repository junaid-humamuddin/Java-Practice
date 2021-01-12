package com.cf.example.Threads;

class NameRunnable1 implements Runnable {
	public void run() {
		System.out.println("NameRunnable running");
		System.out.println("Run by " + Thread.currentThread().getName());
	}
}

public class NameThread {
	public static void main(String[] args) {
		// we can even get the name of the thread running our main code-- as as shown 
		/*System.out.println("thread is "
				+ Thread.currentThread().getName());*/
		NameRunnable1 nr = new NameRunnable1();
		Thread t = new Thread(nr);
		t.setName("Fred");
		t.start();
	}
}