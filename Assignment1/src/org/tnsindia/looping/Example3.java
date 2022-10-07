package org.tnsindia.looping;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    // System.out.println("Enter the value");
	     //int input= s.nextInt();
	     
	      int i=1;
	     
	     do {
	    	 
	    	// int res= input*i;
	    	// i++;
	    	 int res= i;
	    	 i++;
	    	 System.out.println(res);
	     }
	     while(i<=10);
	}

}
