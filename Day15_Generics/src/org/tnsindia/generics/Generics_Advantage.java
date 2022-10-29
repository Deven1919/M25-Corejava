package org.tnsindia.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generics_Advantage {

	public static void main(String[] args) {
	 List<Integer> obj=  new LinkedList<>();
	 // Here we not mention any data type so we can use any data here
	 // But if we mention the data type then only that data-type operation has
	 // execute the statement other not.
	 // only the integer type value is going to execute here other are not 
	 // executing.
      obj.add(12);
//      obj.add("Deva"); // they are getting executed because it is string type
//      obj.add(12.25);// it is float so they are not execute.
     System.out.println(obj);
      
     // Type casting not allowed
     List <String> obj1= new ArrayList<String>();
     obj1.add("Deva");
     String s= obj1.get(0);
     System.out.println(s);
     
     // give error warining at compile time 
     // which is good to find the error before
     // execution of program.
     
     
     
	}

}
