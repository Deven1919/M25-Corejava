package org.tnsindia.inheritance;
import java.util.Scanner;

class Animal
{

	public void display(String name)
	{
		System.out.println("The Animal is: "+name);
	}
	
}

class Dog extends Animal
{
	
	public void print(String Breed)
	{
		System.out.println("The Dog Breed is: "+Breed);
	}
	
	
}
public class Inheritance {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Animal name:");
	String input1= s.next();
	System.out.println("Enter Breed :");
	String input2= s.next();
	Dog d =new  Dog();
	d.display(input1);
	d.print(input2);
	
	
	}

}
