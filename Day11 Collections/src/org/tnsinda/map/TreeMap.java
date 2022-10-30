package org.tnsinda.map;
import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableMap;
public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeMap does not contain null key but it contains many null value
				//SortedMap<String,String>obj=new TreeMap<>();
				NavigableMap<String,String>obj=new TreeMap<>();
				obj.put("Parikshit", "Student");
				obj.put("Nia", "Doctor");
				obj.put("Ashwini", "Engineer");
				obj.put("Shiwani", null);
				System.out.println(obj);
				//to extract the pairs from map
				for(Map.Entry m:obj.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
				System.out.println(obj.firstEntry());
				System.out.println(obj.lastEntry());
				System.out.println(obj.lastKey());


			}
	}


