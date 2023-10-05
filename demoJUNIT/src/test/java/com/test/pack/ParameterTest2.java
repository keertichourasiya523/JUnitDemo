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
public class ParameterTest2 {

	private int expected;
	private int x[];
	
	private simpleOperations sop;

	

	public ParameterTest2(int expected, int[] x) {
		super();
		this.expected = expected;
		this.x = x;
	}

	@Parameterized.Parameters 
	/* the method defined under this annotation will be 
	executed again and again when constructor is executed */
	
public static Collection input() {
		
		return Arrays.asList(new Object[][] {{10, new int[] {11,10,15}},{20, new int [] {50,30,20}},{30,new int [] {100,30,50}}});
	}
	
	@Before
	public void init() {
		
		sop=new simpleOperations();
		
	}
	
	@Test
	public void testFindMin() {
		assertEquals(expected, sop.findMinVal(x));
	}
	
	
	
	
	
}
