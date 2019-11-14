package com.training.inheritanceassignments.testpayrollsoftware;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.payrollsoftware.PayrollSoftware;

/**
 * 
 * @author MManjula
 *
 */
public class TestPayrollSoftware {

	private PayrollSoftware employee;

	/**
	 * creates object before each test class
	 */
	@Before
	public void setUp() {
		employee = new PayrollSoftware(118166, "Darke", 375000, 2500);
	}

	/**
	 * test the calculated gross salary
	 */
	@Test
	public void testCalculateGrossSalary() {
		assertEquals(565000, employee.getGrossSalary(), 0.02);
	}

	/**
	 * test the calculated net salary
	 */
	@Test
	public void testCalculateNetSalary() {
		assertEquals(519800, employee.getNetSalary(), 0.02);
	}

	/**
	 * test the print details of the employee
	 */
	@Test
	public void testPrintDetails() {
		assertEquals("employeeId=118166, employeeName=Darke, basicSalary=375000.0, hra=187500.0, "
				+ "medical=2500.0, pf=45000.0, netSalary=519800.0, grossSalary=565000.0", employee.toString());
	}

	/**
	 * executes after every test class 
	 */
	@After
	public void tearDown() {
		employee = null;
	}

}
