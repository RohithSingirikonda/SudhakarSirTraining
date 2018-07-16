package com.selenium.basics;

public class C02_Operators {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		
		
		//System.out.println(a++ + ++a + a++ + ++a);			//2+4+4+6 = 16
		
		//System.out.println(b-- + --b + b-- + --b);			//5+3+3+1 = 12
		
		//System.out.println(a++ + --b + b-- + ++a);			//2+4+4+4 = 14
		
		//System.out.println(a++ + b-- + a-- + b++ + --a + ++b + --a);   //2+5+3+4+1+6+0 = 21
		
		System.out.println(a++ - b-- + a-- - b++ + --a - ++b + --a);	 //2-5+3-4+1-6+0 = -9

	}

}
