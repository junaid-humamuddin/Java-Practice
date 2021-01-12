package com.cf.example.regex;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?" , "__abcd@gm.fgjg.kh.a.cjkoom"));

	}

}
