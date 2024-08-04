package com.t;

public class array {
	public static void main(String [] args) {
		int a[] = {1,3,4,6,7,8};
		for (int i=0;i<a.length;i++) {
			int b=a[i];
			if(isPrime(b)) {
				System.out.println(b+"is prime number");
			}else {
				System.out.println(b+"is not prime number");
			}
		}
	}
	private static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		for(int i=2; i < number;i++) {
			if(number% i == 0) {
				return false;
			}else {
				return true;
			}
		}
		return false;
	}
	}




