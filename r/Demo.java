package com.r;
import java.util.Scanner;

public class Demo {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("please enter your name ");
		String a=sc.next();
		
		System.out.println("please enter your last name");
		String lastname=sc.next();
		
		System.out.println("please enter your age");
		int b=sc.nextInt();
		
		System.out.println("please enter");
		char e=sc.next().charAt(0);
		
		System.out.println("value of a is:"+a+lastname);
		System.out.println(b);
		System.out.println(e);*/
		
		
		System.out.println("please enter no.");
		int a=sc.nextInt();
	    System.out.println("please enter number");
	    int b=sc.nextInt();
	    System.out.println("please enter number");
	    int c=sc.nextInt();
	    
	    
	    if(a>b&&a>c) {
	    	System.out.println("a is greater");
	    }else if(b>a&&b>c) {
	    	System.out.println("bis greater");
	    }else {
	    	System.out.println("c is greater");
	    }
	    
	    
	    if(a<b&&b<c) {
	    	System.out.println("a is minimum");
	    }else if(b<a&&b<c) {
	    	System.out.println("bis minimum");
	    }else {
	    	System.out.println("c is minimum");
	    }
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
