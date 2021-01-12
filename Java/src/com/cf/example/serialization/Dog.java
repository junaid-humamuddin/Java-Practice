package com.cf.example.serialization;

import java.io.*;

public class Dog implements Serializable {
	private Collar theCollar;
	private int dogSize;

	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}

	/**
	 * @return the theCollar
	 */
	public Collar getTheCollar() {
		return theCollar;
	}

	/**
	 * @param theCollar the theCollar to set
	 */
	public void setTheCollar(Collar theCollar) {
		this.theCollar = theCollar;
	}

	
}
