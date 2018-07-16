package com.selenium.basics;

public class C01_DataTypes {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 50.5;
		char c = 'A';
		String d = "Hello"; 
		int a1 = 'A', a2='Z';
		boolean bool = false; 
		
		System.out.println(a+b+""+c+""+d);		//150.5AHello
		
		System.out.println(a+c+d+b);			//165Hello50.5   --A Missing
		
		System.out.println(c+d+a+b+bool);		//AHello10050.5false
		
		System.out.println(c+d+(a+b));			//AHello150.5
		
		System.out.println((a+b)+c+d);   		//215.5Hello
		
		System.out.println(a1+"....."+a2);		//65......90
		

	}

}
