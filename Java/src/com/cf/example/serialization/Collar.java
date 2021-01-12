package com.cf.example.serialization;

import java.io.*;

class Collar implements Serializable {
	private int collarSize;

	public Collar(int size) {
		collarSize = size;
	}

	/**
	 * @return the collarSize
	 */
	public int getCollarSize() {
		return collarSize;
	}

	/**
	 * @param collarSize the collarSize to set
	 */
	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}

	
}