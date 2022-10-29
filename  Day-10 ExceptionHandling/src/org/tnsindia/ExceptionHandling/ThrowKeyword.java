package org.tnsindia.ExceptionHandling;
import java.util.*;
public class ThrowKeyword {

	public static void display(int age ,String name) {

		if(age>=18 && name=="Deva") {
		
			System.out.println("Match found");
			
			
		}
		else {
			throw  new ArithmeticException("NOT FOUND");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age= s.nextInt();
		System.out.println("Enter the name:");
		String name= s.next();
		display(age,name);
			//display(18,"Deva");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
