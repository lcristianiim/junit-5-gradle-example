package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class MockWithJunit5WithJunit5AssertionsTest {
	@Test
	void givenTwoNumbers_ShouldAddThem() throws InterruptedException {
		Calculator mockCalculator = mock(Calculator.class);
		when(mockCalculator.sum(1,2)).thenReturn(10);
		Assertions.assertEquals(10, mockCalculator.sum(1, 2));
	}

	@Test
	void givenTwoNumbers_ShouldDiffThem() throws InterruptedException {
		Calculator mockCalculator = mock(Calculator.class);
		when(mockCalculator.sum(1,2)).thenReturn(11);
		Assertions.assertEquals(11, mockCalculator.sum(1, 2));
	}
}
