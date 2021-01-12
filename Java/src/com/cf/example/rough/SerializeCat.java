package com.cf.example.rough;

import java.io.*;

class Cat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
} // 1

public class SerializeCat {
	public static void main(String[] args) {
		Cat c = new Cat(); // 2
		try {
			FileOutputStream fs = new FileOutputStream("D://testSerRough.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c); // 3
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("D://testSerRough.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject(); // 4
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}