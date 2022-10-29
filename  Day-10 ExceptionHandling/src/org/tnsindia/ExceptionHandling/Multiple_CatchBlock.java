package org.tnsindia.ExceptionHandling;

import java.util.Scanner;

public class Multiple_CatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stubtr
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= s.nextInt();
		System.out.println("Enter the second number");
		int b= s.nextInt();
		int res= a/b;
		System.out.println("The result is "+res);
		int arr[]= {11,22,33};
		System.out.println(arr[3]);
		
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			
			
			
			
		} 
		catch( Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block is executed!");
		}
		
		

	}

}
