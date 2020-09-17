package com.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.main.java.MathFunctions;

/**
 * @author Yuvraj
 *
 */
@RunWith(PowerMockRunner.class)					// @Runwith helps to invoke the specified class as a test runner instead of default runner.
@PrepareForTest(MathFunctions.class)			// Prepare classes for Testing, which includes static , private, final
@PowerMockIgnore("org.jacoco.agent.rt.*")
public class MathFunctionsTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void square_Test() {
		int expected=25; 
		PowerMockito.spy(MathFunctions.class);
		Mockito.when(MathFunctions.square(Mockito.anyInt())).thenReturn(expected);
		int actual=MathFunctions.square(5);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void multiplication_Test() throws Exception {
		int expected=9;
		MathFunctions mathFunctions=PowerMockito.spy(new MathFunctions());
		PowerMockito.when(mathFunctions, "multiplication", Mockito.anyInt(), Mockito.anyInt()).thenReturn(expected);
		int actual=mathFunctions.operations(3, 3);
		assertEquals(expected, actual);
	
	}
}
