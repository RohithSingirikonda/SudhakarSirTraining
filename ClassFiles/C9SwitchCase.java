package com.java.basics;

public class C9SwitchCase {

	public static void main(String[] args) {
		
		
		//find month index
		
		String mName = "mar";
		
		switch(mName) {
			
		case "mar":
			System.out.println(3);
			
			break;
		case "feb":
			System.out.println(2);
			break;
		case "apr":
			System.out.println(4);
			break;
		case "jan":
			System.out.println(1);
			break;
		default:
			System.out.println("Month not found");
			break;
		}
		
	}

}








