 package org.tnsindia.stream_api;

import java.util.Arrays;
import java.util.List;
public class Filter_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String>obj= Arrays.asList(new String[] {"Deva","Tarnya","Satya","Kalicharan"});
    obj.stream().filter((i->i.length()>5)).forEach((i)->System.out.println(i+""));
   
    		 }

}
