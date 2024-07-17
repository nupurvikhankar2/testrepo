package com.nupur.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalc myCalc=new JenkinsCalc();
		assertEquals(10,myCalc.addNumbers(5, 5));
	}
	public void subtractTest() {
		JenkinsCalc myCalc=new JenkinsCalc();
		assertEquals(5,myCalc.addNumbers(10, 5));
	}
}
