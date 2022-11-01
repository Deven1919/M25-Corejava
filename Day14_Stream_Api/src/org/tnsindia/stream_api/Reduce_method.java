package org.tnsindia.stream_api;

import java.util.Arrays;
import java.util.List;
public class Reduce_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>obj=Arrays.asList(new Integer[] {2,4,6});
obj.stream().reduce(i->i+1).forEach(i->System.out.println(i+""));
	}

}
