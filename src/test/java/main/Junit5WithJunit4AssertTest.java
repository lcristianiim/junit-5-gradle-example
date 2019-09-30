package main;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Junit5WithJunit4AssertTest {

	@Test
	void givenTwoNumbers_ShouldAddThem() throws InterruptedException {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.sum(1, 1));
	}

	@Test
	void givenTwoNumbers_ShouldDiffThem() throws InterruptedException {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.diff(1, 1));
	}

	@Test
	void givenTwoNumbers_ShouldDiffThema() throws InterruptedException {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.diff(2, 1));
	}
}
