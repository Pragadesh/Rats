package kgp.rats;

import kgp.rats.mock.CalculatorService;
import kgp.rats.mock.MathApplication;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	@InjectMocks
	private MathApplication mathApplication;
	
	@Mock
	private CalculatorService calculatorService;
	
	@Test
	public void testAdd(){
		when(calculatorService.add(20, 30)).thenReturn(50d);
		Assert.assertEquals(50, mathApplication.add(20, 30),0);
		verify(calculatorService).add(20, 30);
	}
	
}
