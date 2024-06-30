package com.t;
import java.util.Scanner;
public class T {
	public static void main(String[] args) {
		//question calculator
		Scanner sc= new Scanner(System.in);
		
		String diffno=("yes");
		while (diffno.equalsIgnoreCase("yes")) 
		{
		System.out.println("please enter the number");
		int a=sc.nextInt();
		System.out.println("please enter the number");
		int b=sc.nextInt();
		String sameno=("yes");
		
		while(sameno.equalsIgnoreCase("yes")) {
		
		System.out.println( "please choice:- 1.add, 2.subtract,3.mul, 4.div, 5.mod");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("add:-"+(a+b));
			break;
		case 2:
			System.out.println("subtract"+(a-b));
			break;	
	    case 3:
			System.out.println("mul"+(a*b));
		    break;	
	    case 4:
		    System.out.println("div"+(a/b));
		    break;	
        case 5:
			System.out.println("mod"+(a%b));
		    break;
		    default:
		    	System.out.println("invalid choice");
		}
		    	
		    	System.out.println("do you want to continue with same no.");
		    	 sameno=sc.next();}
		
	System.out.println("do you want to continue with diff  no");
	diffno=sc.next();
		
	
}
}
}