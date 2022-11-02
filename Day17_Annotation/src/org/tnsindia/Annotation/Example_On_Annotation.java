package org.tnsindia.Annotation;



class Parent{
	
	
	public void display() {
		
		System.out.println("parent class method");
	}
	
	
}
class Child extends Parent{
	
	@Override
	public void display() {
	
// for accessing the method of parent class use super keyword.
		
		super.display();
		System.out.println("Child class method!");
	}
}



public class Example_On_Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Parent c= new Child();
	 Child a= new Child();
		a.display();
		Parent p= new Parent();
		p.display();

	}

}
