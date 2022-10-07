package org.tnsindia.looping;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value:");
		int input= s.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			int res= input*i;
			System.out.println(res);
			
		}

	}

}
