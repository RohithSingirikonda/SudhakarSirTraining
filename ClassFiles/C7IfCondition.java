package com.java.basics;

import javax.swing.JOptionPane;

public class C7IfCondition {

	public static void main(String[] args) {
		
		//find odd number
		
		int n=Integer.parseInt(JOptionPane.showInputDialog("enter number"));
		//System.out.println(n/2);
		//System.out.println(n%2);
		
		if(n%2==1) {
			System.out.println(n+" is an odd number");
		}else {
			System.out.println(n+" is an even number");
		}
	}

}
