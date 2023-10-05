package com.test.pack;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.development.pack.simpleOperations;

@RunWith(Parameterized.class)
public class ParameterTest {

	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private int x[];
	
	private simpleOperations sop;

	
	
	public ParameterTest(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
		
	}

	@Parameterized.Parameters 
	/* the method defined under this annotation will be 
	executed again and again when constructor is executed */
	
	public static Collection inputs() {
		
		return Arrays.asList(new Object[][] {{10,20,30},{-10,-20,-30},{10,-20,-10}});
	}
	
	@Before
	public void init() {
		
		sop=new simpleOperations();
		
	}
	
	@Test
	public void testAdd() {
		assertEquals(expectedResult, sop.Addition(firstNumber, secondNumber));
	}
	
	
	
	
	
	
}
