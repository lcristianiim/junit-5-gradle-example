package main;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationsJunit4Test {
	@InjectMocks
	private Calculator mockedCalculator;
	@Mock
	private XClass x;

	@Test
	public void shouldInjectIntoTheMock() {
		when(x.getX()).thenReturn("hello");
		Assert.assertEquals("hello", mockedCalculator.getX().getX());
	}
}