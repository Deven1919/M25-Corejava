package org.tnsindia.generics;

public class Generics_Method {

	
	public static <E> void display(E[] item) {
		
		
		for (E itr: item) {

			System.out.println(itr.getClass().getName());
			System.out.println(itr);
	}
	
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Integer[] obj1= {1,2,3,4,5};
  String[] obj2= {"Deva","Shubhu"};
  System.out.println("Show the element in Integer");
  display(obj1);
  System.out.println("Show the element in String");
  display(obj2);
  
  
	}

}
