package com.demo;

public class Demo {
	public static void main(String[] args) {
		
		String a="Hello world"; //true 
		 Boolean val=a.contains("Hello");
         System.out.println(val);
		
		Boolean val1=a.equals("hello");//false
		System.out.println(val1);
		
	    Boolean val3=a.equals("Hello world");// true
		System.out.println(val3);
		
		Boolean val4=a.equalsIgnoreCase("hello world");
		System.out.println(val4);
	}

}
