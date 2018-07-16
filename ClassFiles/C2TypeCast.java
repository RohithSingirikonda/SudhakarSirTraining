package com.java.basics;

public class C2TypeCast {

	public static void main(String[] args) {

		byte x = 100;

		int i = x; // implicit

		int y = 131;
		byte b = (byte) y; //explicit
		System.out.println(b);

	}

}
