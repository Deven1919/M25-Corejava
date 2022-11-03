package org.tnsindia.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JUnit_Testing {

	@Test // used to test the method that is successfully gives the result or not
	void display() {
		System.out.println("Welcome to Testing!");
	}
	
	
	@Test
	@Disabled // this Disable or skip the execution of method.
	void test() {
		fail("Not yet implemented");
	}

}
