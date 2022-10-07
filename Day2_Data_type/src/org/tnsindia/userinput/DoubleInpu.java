package org.tnsindia.userinput;

import java.util.Scanner;

public class DoubleInpu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first numnber:");
	     double input1= s.nextInt();

	 	System.out.println("Enter the second numnber:");
	      double input2= s.nextInt();
	      
	      double res= input1+input2;
	      System.out.println("The result:"+res);

	}

}
