package org.tnsindia.eum_and_regular_expression;

public class Enum_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It does't support the object creation
		//Eum constant cannot be overiddern.
		//It can implement Inteface like Classes.
          Car obj= Car.HONDA; // cannot creat object for object creation we use new keyword
       //   System.out.println(obj);
          
          
          for(Car c:Car.values()) {
        	  System.out.println(c.HONDA);
          }
          
          
          
	}

}
