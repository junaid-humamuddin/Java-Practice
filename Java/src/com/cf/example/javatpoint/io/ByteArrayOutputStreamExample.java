package com.cf.example.javatpoint.io;

import java.io.*;

public class ByteArrayOutputStreamExample {

	public static void main(String args[]) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("D:\\f1.txt");
		FileOutputStream fout2 = new FileOutputStream("D:\\f2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
//void writeTo(OutputStream out) ---  It is used for writing the complete content of a byte array 
									//output stream to the specified output stream.
		bout.flush();
		bout.close();// has no effect
		System.out.println("Success...");
	}
}

// Refer Web for clear pictorial representation