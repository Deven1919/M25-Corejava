package org.tnsinda.map;
import java.util.Map;
import java.util.HashMap;
public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String>obj=new HashMap<>();
		
		//1.Key can't be duplicated but value can be duplicated
		//2.it follows the sorting order
		obj.put(1,"Nayna");
		obj.put(4,"Neha");
		obj.put(1,"Nitara");
		obj.put(2,"Nayna");
		obj.put(null, null);
		obj.put(5, null);
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		//to extract the pairs from map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
