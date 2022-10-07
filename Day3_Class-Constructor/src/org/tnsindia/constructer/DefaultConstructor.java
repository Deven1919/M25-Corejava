package org.tnsindia.constructer;

class A{
	//variable
	public int speed;
	//method
	void display( )
	{
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//default constructor
	//Constructor is used to initialize the value of the variables
	A()
	{
		 speed = 60;
	}
	}




public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new A();
		a.display();
		

	}

}
