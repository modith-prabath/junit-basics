package com.modith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils m = new MathUtils();
	
	int expected = 3 ;
	int actual = m.add(1, 2);

	@Test
	void test() {
		assertEquals(expected, actual, "The add method should add two numbers");
	}

}
