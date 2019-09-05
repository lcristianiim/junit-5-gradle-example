package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorJunit5Test {
	@Test
	void givenTwoNumbers_ShouldAddThem() throws InterruptedException {
		Calculator calculator = new Calculator();
		Thread.sleep(4000);
		Assertions.assertEquals(2, calculator.sum(1, 1));
	}

	@Test
	void givenTwoNumbers_ShouldDiffThem() throws InterruptedException {
		Calculator calculator = new Calculator();
		Thread.sleep(4000);
		Assertions.assertEquals(0, calculator.diff(1, 1));
	}
}
