package org.ci.junit;

import static org.junit.Assert.*;

import org.ci.app.CalculatorEngine;
import org.junit.Test;


public class SimpleJUnitTestClass {

	private CalculatorEngine tester;
	
	public SimpleJUnitTestClass() {
		super();
		this.tester = new CalculatorEngine();
		
	}
	
	@Test
	public void testAddition() {

	   // check if addition of 4 and 5 is equal to 9
	   assertEquals("4 + 5 must be 9", 9, this.tester.addTwoNumbers(4, 5));
	 } 
	
	@Test
	public void testSubtraction() { 
	   
	   // check if addition of 4 and 5 is equal to 9
	   assertEquals("16 - 7 must be 9", 9, this.tester.subTwoNumbers(16, 7));
	 } 

}
