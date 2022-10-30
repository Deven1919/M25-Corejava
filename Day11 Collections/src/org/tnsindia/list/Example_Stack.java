package org.tnsindia.list;
import java.util.Stack;
public class Example_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s=new Stack<>();
		//Push -Insertion
		s.push(1);
		s.push(5);
		s.push(8);
		System.out.println(s);
		//pop-Deletion
		s.pop();
		//s.remove(0);//it delete oth index element
		System.out.println(s);

	}

}
