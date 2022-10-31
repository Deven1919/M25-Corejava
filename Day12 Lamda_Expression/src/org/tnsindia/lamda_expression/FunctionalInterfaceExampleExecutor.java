package org.tnsindia.lamda_expression;

import java.util.Scanner;

public class FunctionalInterfaceExampleExecutor {

	public static void main(String[] args) {
		FunctionalInterfaceExample obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			
			//System.out.println("The maximum number is:" +result);
			return result;
			
		};
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int first = s.nextInt();
		System.out.println("Enter the 2nd number:");
		int second = s.nextInt();		
		
		
		
		System.out.println("The maximum number is:" +obj.max(first, second));

	}

}