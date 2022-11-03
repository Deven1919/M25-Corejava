package org.tnsindia.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Parameterize_Test {

	@DisplayName("Example on parameterize")
	@ParameterizedTest
	//Source annotation
	//@ValueSource(ints= {11,22,33})
	@ValueSource(floats= {11.0f,22.2f,33.3f})
	void display(float arg)
	{
		assertTrue(arg>10.2f);
	}
//	void show(int arg)
//	{
//		assertTrue(arg>10.2f);
//	}
}
