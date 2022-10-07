package org.tnsindia.export;

import java.util.Scanner;
import org.tnsindia.imports.*;

public class exportPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1=s.nextLine();
		
		ImportPublic d=new ImportPublic();
		d.str=str1;
		d.display();
		s.close();


	}

}
