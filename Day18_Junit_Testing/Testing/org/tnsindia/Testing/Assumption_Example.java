package org.tnsindia.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class Assumption_Example {

	@Test
	
public void display() {
		//Executes when the given condition is true.
		System.setProperty( "Deva", "24");// It work like key-value pair.
		Assumptions.assumeTrue("24".equals(System.getProperty("Deva")));
		
	}
	@Test
	
public void show() {
		// Not Execute if it not matches the condition.s
		System.setProperty( "Deva", "24");// It work like key-value pair.
		Assumptions.assumeTrue("24".equals(System.getProperty("Shubham")));
		
	}
}
