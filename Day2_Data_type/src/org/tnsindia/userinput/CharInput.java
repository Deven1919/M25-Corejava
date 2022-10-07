package org.tnsindia.userinput;

import java.util.Scanner;

public class CharInput {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first numnber:");
	     char input1=s.next().charAt(1);

	 	System.out.println("Enter the second numnber:");
	      char input2= s.next().charAt(2);
	      
	      char res= input1;
	      char res1= input2;

	      System.out.println("The result:"+res);
	      System.out.println("The result:"+res1);
		
		
		
	}

}
