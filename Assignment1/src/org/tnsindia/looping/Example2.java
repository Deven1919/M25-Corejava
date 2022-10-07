package org.tnsindia.looping;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the value");
     int input= s.nextInt();
      
     int i= 1;
     while(i<=10) {
    	 
    	 int res =input*i;
    	 i++;
    	 System.out.println(res);
     }
	
	
	}

}
