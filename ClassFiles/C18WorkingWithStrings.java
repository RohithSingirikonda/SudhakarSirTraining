package com.java.basics;

import javax.swing.JOptionPane;

public class C18WorkingWithStrings {

	public static void main(String[] args) {
		
		/*
		 * compare
		 * verify substring
		 * replace
		 * length
		 * extract substring
		 * 
		 * reverse String
		 */

		String strExpected = "selenium";
		String strActual = " Selenium ";
		
		if(strActual.trim().equalsIgnoreCase(strExpected.trim())) {
			System.out.println("Both are same");
		}else {
			System.out.println("both are different");
		}
		
		if(strActual.trim().compareToIgnoreCase(strExpected.trim())==0) {
			System.out.println("Both are same");
		}else {
			System.out.println("both are different");
		}
		
		
		
	}

}













