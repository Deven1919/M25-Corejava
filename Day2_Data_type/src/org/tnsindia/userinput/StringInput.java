package org.tnsindia.userinput;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first numnber:");
	     String input1= s.next();

	 	System.out.println("Enter the second numnber:");
	      String input2= s.next();
	      
	      String res= input1 +" " + input2;
	      System.out.println("The result:"+res);
	}

}
