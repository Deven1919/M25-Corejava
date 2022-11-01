package org.tnsindia.stream_api;

import java.util.Arrays;
import java.util.List;
public class Map_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>obj= Arrays.asList(new Integer[] {2,4,6});
obj.stream().map(i->i*2).forEach(i->System.out.println(i+""));

	}

}
