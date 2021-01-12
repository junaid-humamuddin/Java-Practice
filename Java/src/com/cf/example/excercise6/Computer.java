package com.cf.example.excercise6;

import java.io.*;

class Keyboard {
}

public class Computer implements Serializable {
	private Keyboard k = new Keyboard();

	public static void main(String[] args) {
		Computer c = new Computer();
		c.storeIt(c);
	}

	void storeIt(Computer c) {
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D://myFileExc"));
			os.writeObject(c);
			os.close();
			System.out.println("done");
		} catch (Exception x) {
			System.out.println("exc");
		}
	}
}
/*An instance of type Computer Has-a Keyboard. Because Keyboard doesn't
implement Serializable, any attempt to serialize an instance of Computer will cause an
exception to be thrown.*/