package com.training.inheritanceassignments.employee;

/**
 * 
 * @author MManjula
 *
 */
public abstract class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	private double hra;

	public Employee() {

	}

	/**
	 * 
	 * @param employeeId
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 */
	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
		this.hra = 0.5 * basicSalary;
	}

	/**
	 * 
	 * setter and getter method
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public abstract double calGrossSalary();

	public abstract double calNetSalary();

	/**
	 * toString() method to return the employee object
	 */
	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", medical=" + medical+" " ;
	}

}
