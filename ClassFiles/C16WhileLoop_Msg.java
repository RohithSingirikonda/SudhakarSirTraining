package com.java.basics;

import javax.swing.JOptionPane;

public class C16WhileLoop_Msg {

	public static void main(String[] args) {
		
		boolean isMsgDisplayed = false;
		
		while(!isMsgDisplayed) {
			System.out.println(isMsgDisplayed);
			
			isMsgDisplayed = Boolean.parseBoolean(JOptionPane.showInputDialog("Is message displayed"));
		}
	}

}
