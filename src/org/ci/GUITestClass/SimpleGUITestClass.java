package org.ci.GUITestClass;


import org.ci.app.Calculator;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class SimpleGUITestClass extends
		ActivityInstrumentationTestCase2<Calculator> {

	private Solo solo;
	
	public SimpleGUITestClass() {
		super(Calculator.class);	
	}

	protected void setUp() throws Exception {
		super.setUp();
		this.solo = new Solo(getInstrumentation(), getActivity());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testNumbers() {
		this.solo.clickOnButton("0");
		this.solo.clickOnButton("1");
		this.solo.clickOnButton("2");
		this.solo.clickOnButton("3");
		this.solo.clickOnButton("4");
		this.solo.clickOnButton("5");
		this.solo.clickOnButton("6");
		this.solo.clickOnButton("7");
		this.solo.clickOnButton("8");
		this.solo.clickOnButton("9");
		
	}
	

}
