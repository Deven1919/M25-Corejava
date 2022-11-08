package org.tnsindia.multithreading;

public class Synchronized_Executor_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronized_Executor_Example m=new Synchronized_Executor_Example();
		Thread t1=new Thread(()->m.arraysum(new int[] {11,22,33}));
		Thread t2=new Thread(()->m.arraysum(new int[] {10,20,30}));
		t1.start();
		t2.start();
	}

}
