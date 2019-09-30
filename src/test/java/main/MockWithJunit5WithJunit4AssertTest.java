package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

class MockWithJunit5WithJunit4AssertTest {
	private Calculator mockedCalculator = mock(Calculator.class);

	@Test
	void givenTwoNumbers_ShouldAddThem() throws InterruptedException {
		Mockito.when(mockedCalculator.sum(1,2)).thenReturn(10);
		Assert.assertEquals(10, mockedCalculator.sum(1, 2));
	}

	@Test
	void givenTwoNumbers_ShouldDiffThem() throws InterruptedException {
		Mockito.when(mockedCalculator.sum(1,2)).thenReturn(11);
		Assert.assertEquals(11, mockedCalculator.sum(1, 2));
	}
}
