package org.tnsindia.userinput;

import java.util.Scanner;

public class IntegerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first numnber:");
	     int input1= s.nextInt();

	 	System.out.println("Enter the second numnber:");
	      int input2= s.nextInt();
	      
	      int res= input1+input2;
	      System.out.println("The result:"+res);

	}

}
