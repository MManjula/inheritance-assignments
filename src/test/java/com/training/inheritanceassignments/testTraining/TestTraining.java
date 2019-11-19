package com.training.inheritanceassignments.testTraining;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.training.CorporateTraining;
import com.training.inheritanceassignments.training.PublicTraining;
import com.training.inheritanceassignments.training.Training;

/**
 * 
 * @author MManjula
 *
 */
public class TestTraining {
	private Training participant1, participant2;

	/**
	 * executes before each test class and creates an object of PublicTraining class
	 * up-casted to Training
	 */
	@Before
	public void setUp() {
		participant1 = new PublicTraining(1001, "JAVA", 5000, 50);
		participant2 = new CorporateTraining(2001, ".NET", 6000, 75);
	}

	/**
	 * test for getting the order value of PublicTraining
	 */
	@Test
	public void testPublicTraining() {
		assertEquals(250000, participant1.getOrderValue(), 0.02);
	}

	/**
	 * test for getting the order value of CorporateTraining
	 */
	@Test
	public void testCorporateTraining() {
		assertEquals(450000, participant2.getOrderValue(), 0.02);
	}

	/**
	 * executes after each test class and clears the object
	 */
	@After
	public void tearDown() {
		participant1 = null;
		participant2 = null;
	}

}
