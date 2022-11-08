package org.tnsindia.multithreading;

public class Synchornized_Example {

	synchronized void arraysum(int[] arr)
	{
		int sum=0;
		for(int itr:arr)
		{
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
