package com.java.basics;

import javax.swing.JOptionPane;

public class C17DoLoop_Msg {

	public static void main(String[] args) {
		
		boolean isMsgDisplayed = true;
		
		do {
			System.out.println(isMsgDisplayed);
			
			isMsgDisplayed = Boolean.parseBoolean(JOptionPane.showInputDialog("Is message displayed"));
		}while(!isMsgDisplayed);
	}

}
