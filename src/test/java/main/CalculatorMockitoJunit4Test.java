package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

class CalculatorMockitoJunit4Test {
	private Calculator mockedCalculator = mock(Calculator.class);

	@Test
	void givenTwoNumbers_ShouldAddThem() throws InterruptedException {
		Mockito.when(mockedCalculator.sum(1,2)).thenReturn(10);
		Thread.sleep(4000);
		Assert.assertEquals(10, mockedCalculator.sum(1, 2));
	}

	@Test
	void givenTwoNumbers_ShouldDiffThem() throws InterruptedException {
		Mockito.when(mockedCalculator.sum(1,2)).thenReturn(11);
		Thread.sleep(4000);
		Assert.assertEquals(11, mockedCalculator.sum(1, 2));
	}
}
