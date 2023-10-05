package com.test.pack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.development.pack.*;
public class TestClass {
	static simpleOperations sop=null;
	
	@BeforeClass
	public static void init() {
		System.out.println("Init Method");
	sop=new simpleOperations();
	}
	
	@AfterClass
	public static void endtestcase() {
		System.out.println("End test case Method");
	sop=null;
	}
	
	
	@Test
	public void testAddition() {
		simpleOperations sop=new simpleOperations();
		int actuals=sop.Addition(10, 20);
		int expected=30;
		
		assertEquals(expected,actuals);
				
	}
	@Test
	public void testPositive() {
		simpleOperations sop=new simpleOperations();
		int actuals=sop.Addition(10, 20);
		int expected=30;
		
		assertEquals(expected,actuals);
							
	
	}
	@Test
	public void testNegative() {
		simpleOperations sop=new simpleOperations();
		int actuals=sop.Addition(-10,20);
		int expected=10;
		
		assertEquals(expected,actuals);
								
	
	}
	@Test
	public void testSmall(){
		
		simpleOperations sop=new simpleOperations();
		int actual=sop.findMinVal(new int[] {10,3,4,2});
		int expected=2;
		assertEquals(expected, actual);
	}
	
}
