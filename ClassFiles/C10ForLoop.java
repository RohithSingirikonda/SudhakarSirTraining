package com.java.basics;

public class C10ForLoop {

	public static void main(String[] args) {
		
		//print 10 for 5 times
		
		for(int i=1;i<=10;i++) {
			System.out.println(10);
		}
		
		//print numbers from 1 to 10
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		//print numbers from 10 to 1
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}

		//print odd numbers from 10 to 30
		for(int i=11;i<=30;i+=2) {
			System.out.println(i);
		}
		
		//print odd numbers from 10 to 30 (actual logic)
		for(int i=10;i<=30;i++) {
			
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		
		//print values of an array
		int x[] = {10,20,30};
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}

}













