package com.java.basics;

import javax.swing.JOptionPane;

public class C15WhileLoop {

	public static void main(String[] args) {
		
		int n=1;
		
		while(n<10) {
			System.out.println(n);
			n=Integer.parseInt(JOptionPane.showInputDialog("enter number"));
		}

	}

}
