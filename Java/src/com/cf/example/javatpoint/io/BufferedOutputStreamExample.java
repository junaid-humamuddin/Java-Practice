package com.cf.example.javatpoint.io;

/*In this example, we are writing the textual information in the BufferedOutputStream object which is 
connected to the FileOutputStream object. The flush() flushes the data of one stream and send it into another. 
It is required if you have connected the one stream with another.*/

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to javaTpoint.";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
	}
}