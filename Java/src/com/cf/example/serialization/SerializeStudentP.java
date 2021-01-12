package com.cf.example.serialization;

import java.io.*;

public class SerializeStudentP {

	public static void main(String[] args) throws Exception {

		StudentP sp = new StudentP(211, "ravi", "cse", 2000);
		FileOutputStream fout = new FileOutputStream("D://studentFile.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(sp);
		out.flush();
		System.out.println("success");
	}

}
