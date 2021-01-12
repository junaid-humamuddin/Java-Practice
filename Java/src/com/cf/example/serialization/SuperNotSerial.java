package com.cf.example.serialization;

import java.io.*;

class SuperNotSerial {
	public static void main(String[] args) {
		Dog1 d = new Dog1(35, "Fido");
		System.out.println("before: " + d.name + " " + d.weight);
		try {
			FileOutputStream fs = new FileOutputStream("D://testSer1.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("D://testSer1.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog1) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after: " + d.name + " " + d.weight);
	}
}

//The key here is that because Animal is not serializable, when the Dog was
//deserialized, the Animal constructor ran and reset the Dog's inherited weight variable.