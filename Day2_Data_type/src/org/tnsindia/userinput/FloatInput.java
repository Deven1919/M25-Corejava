package org.tnsindia.userinput;

import java.util.Scanner;

public class FloatInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first numnber:");
	     float input1= s.nextFloat();

	 	System.out.println("Enter the second numnber:");
	      float input2= s.nextFloat();
	      
	      float res= input1+input2;
	      System.out.println("The result:"+res);

	}

}
