package com.java.basics;

public class C14PrimeNumber {

	public static void main(String[] args) {
		
		int n=1;
		
		boolean isPrime = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+" is not prime number");
		}

	}

}
