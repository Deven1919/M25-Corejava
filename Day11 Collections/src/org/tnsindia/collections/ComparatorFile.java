package org.tnsindia.collections;

public class ComparatorFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student std[]= new Student[2];
    std[0]=new Student();
	std[0].setAge(25);
	std[0].setName("Deva");
	
	//for emp2
	std[1]=new Student();
	std[1].setAge(22);
	std[1].setName("Shubhu");
	
	for(int i=0;i<std.length;i++)
	{
		System.out.println("Employee "+(i+1)+"Name: "+std[i].getName()+" "+std[i].getAge());
	}
	//
	Arrays.sort(std, new AgeComparator());
	//age:22-emp1,age:25-emp2
	for(int i=0;i<std.length;i++)
	{
		System.out.println("Employee "+(i+1)+"Name: "+std[i].getName()+" "+std[i].getAge());
	}
	}

}
