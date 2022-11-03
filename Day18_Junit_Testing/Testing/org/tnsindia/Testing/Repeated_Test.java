package org.tnsindia.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class Repeated_Test {

	@RepeatedTest(5)
	// It is used to execute a particular method several time 
	// It depend on user how many time want to execute particular method.
	void test() {
		System.out.println("Hey how's ur day!");
	}

}
