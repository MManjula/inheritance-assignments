package com.training.inheritanceassignments.testEmployee;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.employee.Employee;
import com.training.inheritanceassignments.employee.Manager;
import com.training.inheritanceassignments.employee.MarketingExecutive;

/**
 * 
 * @author MManjula
 *
 */
public class TestEmployee {
	private Employee employee1;
	private Employee employee2;

	/**
	 * executes before each test class, creates new object
	 */
	@Before
	public void setUp() {
		employee1 = new Manager(18314, "Manjula", 650000, 5000);
		employee2 = new MarketingExecutive(18315, "Drake", 750000, 6000, 1000);
	}

	@Test
	public void testManager() {
		assertEquals(
				"employeeId=18314, employeeName=Manjula, basicSalary=650000.0, medical=5000.0 petrolAllowance=52000.0, "
						+ "foodAllowance=84500.0, otherAllowances=19500.0, managerGrossSalary=980000.0, managerNetSalary=901800.0",
				employee1.toString());

	}

	@Test
	public void testMarketingExecutive() {
		assertEquals(
				"employeeId=18315, employeeName=Drake, basicSalary=750000.0, medical=6000.0 kilometersTravelled=1000.0,"
						+ " tourAllowance=5000.0, marketingExecutiveGrossSalary=1131500.0, marketingExecutiveNetSalary=1124800.0",
				employee2.toString());
	}

	/**
	 * executes after each test class and clears the object
	 */
	@After
	public void tearDown() {
		employee1 = null;
		employee2 = null;
	}

}
