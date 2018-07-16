package com.java.basics;

public class C19VerifySubString {

	public static void main(String[] args) {
		
		String strActual = "Welcome sudhakar";
		
		//find sub string exist
		if (strActual.contains("sudhakar")) {
			System.out.println("Sub string exist");
		} else {
			System.out.println("sub string not exist");
		}

		//find sub string exist at specific position
		if(strActual.indexOf("sudhakar")==8) {
			System.out.println("Sub string exist at 8th position");
		}else {
			System.out.println("Sub string not exist at 8th position");
		}
		
		//find how many times substring exist
		String[] spStr = strActual.split("a");
		System.out.println(spStr.length-1);
	}

}











