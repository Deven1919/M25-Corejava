package org.tnsindia.ExceptionHandling;
import java.util.Scanner;
public class FinallyBlock {
	public static void print()
	{
		try 
		{
		Scanner s = new Scanner(System.in);
	     System.out.println("Enter the first number");
	     int x= s.nextInt();
	     System.out.println("Enter the second number");
	     int y= s.nextInt();
			
			int result = x/y;
			System.out.println("Inside try block- "+result);
			//1.no any further statement will exceute
			System.exit(0);
		}

		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}
		
		finally
		{
			System.out.println("finally block"); // this block always execute if their is exception 
			                                    // also occured during compile the program.
           
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
print();
	}

}



