package com.cf.example.excercise6;

import java.io.*;

class Player {
	Player() {
		System.out.print("p");
	}
}

class CardPlayer extends Player implements Serializable {
	CardPlayer() {
		System.out.print("c");
	}

	public static void main(String[] args) {
		CardPlayer c1 = new CardPlayer();
		try {
			FileOutputStream fos = new FileOutputStream("D://play.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(c1);
			os.close();
			FileInputStream fis = new FileInputStream("D://play.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			CardPlayer c2 = (CardPlayer) is.readObject();
			is.close();
		} catch (Exception x) {
		}
	}
}