package com.cf.example.serialization;

import java.io.*;

class Dog1 extends Animal implements Serializable {
	String name;

	Dog1(int w, String n) {
		weight = w; // inherited
		name = n; // not inherited
	}
}
