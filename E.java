package com.t;
import java.util.Scanner;
public class E {
public static void main(String [] args) {
 Scanner sc= new Scanner(System.in);
 
 System.out.println("please enter the number");
 int a=sc.nextInt();
 
 int i=1;
 int b=0;
 do{
	 
	 if (a%i==0) {
		 b++;
	 }
	 i++;	 
 }while(i<=a);
 
 if(b==0) {
	 System.out.println("the number is prime no");
	 
 }else {
	 System.out.println("the number is not prime no.");
	 
 }	
}
}
