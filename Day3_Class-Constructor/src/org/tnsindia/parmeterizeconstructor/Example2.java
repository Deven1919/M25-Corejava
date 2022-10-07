package org.tnsindia.parmeterizeconstructor;

import java.util.Scanner;

class Car{
	 
	 
	 public int speed;
	 
	 Car(int s){
	     speed =s;
	     System.out.println("The Speed is:"+speed+"km/hr");
	     
		 
		 
		 
	 }

	 
	 
 }



public class Example2 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the speed:");
int input = s.nextInt();
   Car c= new Car(input);
 
		   

	}

}
