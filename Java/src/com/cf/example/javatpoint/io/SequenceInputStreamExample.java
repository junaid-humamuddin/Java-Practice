package com.cf.example.javatpoint.io;

//In this example, we are printing the data of two files testin.txt and testout.txt.

import java.io.*;

public class SequenceInputStreamExample {
	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("D:\\test_In.txt");
		FileInputStream input2 = new FileInputStream("D:\\test_Out.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}

//Example that reads the data from two files and writes into another file

//In this example, we are writing the data of two files testin1.txt and testin2.txt into another file 
//named testout.txt. ------------------- JavaTPoint