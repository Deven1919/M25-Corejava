package org.tnsindia.abstraction;


class B
{
	//if any data members is public the visibility is in any class
	public String name="Deva wakarkar";
	public void display()
	{
		System.out.println("The DOB is: "+name);
	}
}




public class Abstraction_using_public {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b= new B();
     b.display();
		
	}

}
