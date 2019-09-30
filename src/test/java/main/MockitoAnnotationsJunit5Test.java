package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockitoAnnotationsJunit5Test {
	@InjectMocks
	private Calculator mockedCalculator;
	@Mock
	private XClass x;

	@Test
	void shouldInjectIntoTheMock() {
		when(x.getX()).thenReturn("hello");
		Assert.assertEquals("hello", mockedCalculator.getX().getX());
	}
}