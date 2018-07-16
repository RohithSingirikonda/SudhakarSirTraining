package com.java.basics;

public class C6Arrays {

	public static void main(String[] args) {
		
		String[] userDetails = new String[3];
		userDetails[0] = "selenium";
		userDetails[1] = "webdriver";
		userDetails[2] = "12";
		
		System.out.println(userDetails[0]);
		System.out.println(userDetails[1]);
		System.out.println(userDetails[2]);

		int i[] = {10,20,30};
		System.out.println(i[0]);
		
		
		int x[] = new int[2];
		
		String[][] usersData = new String[2][3];
		//1st user data
		usersData[0][0]="sudhakar";
		usersData[0][1]="k";
		usersData[0][2]="13124432432";
		
		//2nd user data
		usersData[1][0]="srinu";
		usersData[1][1]="s";
		usersData[1][2]="4654654656";
		
		System.out.println(usersData[0][0]);
	}

}











