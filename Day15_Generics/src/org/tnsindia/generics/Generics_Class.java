package org.tnsindia.generics;

public class Generics_Class<T> {

	
	T obj;
	public void display() {
		System.out.println(obj.getClass().getName());
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Generics_Class<Integer> obj1= new Generics_Class<>();
  obj1.obj=19;
  obj1.display();
  
	}

}
