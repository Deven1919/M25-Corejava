package org.tnsindia.Annotation;

import java.util.Scanner;

public class SupressAnnotation_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		@SuppressWarnings("resource") // This is use to remove the warning in our code.
		//At compile time.
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first no:");
		int a= s.nextInt();
		System.out.println("Enter the Second no:");
		int b= s.nextInt();
		int res= a/b;
		System.out.println("The Result is:"+res);
	}

}
