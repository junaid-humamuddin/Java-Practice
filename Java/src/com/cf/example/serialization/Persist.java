package com.cf.example.serialization;

import java.io.*;

class Persist {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(211, "ravi");

		FileOutputStream fout = new FileOutputStream("D://f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}
}