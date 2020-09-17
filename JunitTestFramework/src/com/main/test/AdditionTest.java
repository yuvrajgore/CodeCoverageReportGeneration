/**
 * 
 */
package com.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.main.java.Addition;

/**
 * @author Yuvraj
 *
 */
public class AdditionTest {

	/**
	 * @throws java.lang.Exception 
	 */
	@Mock
	private Addition mockedInstance;		// It is mocked instance of Addition class
	
	@InjectMocks
	private Addition actualInstance;		// It is actual instance of Addition class
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);  // It initializes the mock objects
	}

	@Test
	public void add_test() {
		int expected=9;
		Mockito.when(mockedInstance.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(expected);	// mocked add() method
		int actual=actualInstance.add(4, 5);	// Calling actual method add()
		assertEquals(expected, actual);			// comparing the results
	}
	
}
