package org.tnsindia.lamda_expression;
import java.io.File;
import java.io.FileFilter;
public class FileFilter_using_lamda {
	
	
	public static void main(String args[]) {
		
		
		
		
		//Lambda expression to search a file in the given location
				FileFilter filter=(File pathname)->pathname.getName().endsWith(".txt");
				File dir=new File("C:\\Users\\Hp\\Desktop");
				File contents[]=dir.listFiles(filter);
				for(File itr:contents)
				{
					System.out.println(itr);
				}

	}
	
	
	
	
}

