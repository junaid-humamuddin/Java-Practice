

//Java FileInputStream example 1: read single character

package com.cf.example.javatpoint.io;

/*import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = fin.read();
			System.out.print((char) i);

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}*/

//Java FileInputStream example 2: read all characters

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
				// the above is print NOT Println
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}