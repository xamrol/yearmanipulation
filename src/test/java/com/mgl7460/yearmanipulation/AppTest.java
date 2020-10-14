package com.mgl7460.yearmanipulation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class AppTest 
{
	// Declaration
	App yearobject;
	
	// Initiation
	@Before
	public void setUp() throws Exception {
		yearobject = new App();
	}
	
	// Closure
	@After
	public void tearDown() throws Exception {
		yearobject = null;
	}
	
	// Tests
	@Test
	public void testYearLength() {
		assertTrue(Integer.toString(2020).length() == 4);
		assertTrue(Integer.toString(995).length() > 2 && Integer.toString(995).length() < 4);
	}
	
	@Test
	public void testThisYearLeapStatus() {
		assertTrue(yearobject.getThisYearLeapStatus(2016) == true);
		//assertFalse(yearobject.getThisYearLeapStatus(2008) == true);
	}
	
	@Test
	public void testGetNbYearsBetweenTwoValues() {
		assertEquals(4, yearobject.getNbYearsBetweenTwoValues(2016));
		//assertEquals(10, yearobject.getNbYearsBetweenTwoValues(2000));
		assertEquals(0, yearobject.getNbYearsBetweenTwoValues(2020));
	}
	
	@Test
	public void testGetThisYearCentury() {
		assertEquals(21, yearobject.getThisYearCentury(2020));
		//assertEquals(20, yearobject.getThisYearCentury(2000));
		assertEquals(20, yearobject.getThisYearCentury(1978));
	}
}
