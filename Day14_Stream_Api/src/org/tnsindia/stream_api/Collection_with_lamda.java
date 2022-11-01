package org.tnsindia.stream_api;
import java.util.Set;
import java.util.HashSet;
public class Collection_with_lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Integer>obj=new HashSet<>(); 
      obj.add(45);
      obj.add(4);
      obj.add(475);
      obj.add(455);
      System.out.println(obj);
//     
//      for(Integer itr:obj) {
//    	  // using this we can use api for fetching data
//    	  System.out.println(itr+"");
//    	  
//      }
//      
      
      
      
      
           obj.forEach(System.out::println);
	}

}
