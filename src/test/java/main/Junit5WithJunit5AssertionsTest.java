package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Junit5WithJunit5AssertionsTest {
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

}
