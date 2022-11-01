package org.tnsindia.stream_api;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic_Example {
public static void main(String args[]) {
	Stream <String>obj= Stream.of("Deva","Tarun","Satya");
	obj.forEach((i)-> System.out.println(i+""));
	
	List<Integer>obj1= Arrays.asList(new Integer[] {44,55,66,11});
	 obj1.forEach((i)->System.out.println(i+""));

}
}