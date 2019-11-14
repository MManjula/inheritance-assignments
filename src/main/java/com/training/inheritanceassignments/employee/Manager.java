package com.training.inheritanceassignments.employee;

public class Manager extends Employee {

	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowances;
	private double managerGrossSalary;
	private double managerNetSalary;
	private static int pt = 200;

	public Manager() {
	}

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		this.petrolAllowance = 0.08 * basicSalary;
		this.foodAllowance = 0.13 * basicSalary;
		this.otherAllowances = 0.03 * basicSalary;
	}

	/**
	 * Overriding method to implement calGrossSalary() of Employee class
	 */
	@Override
	public double calGrossSalary() {
		managerGrossSalary = super.getBasicSalary() + super.getHra() + super.getMedical();
		return managerGrossSalary;
	}

	/**
	 * Overriding method to implement calNetSalary() of Employee class
	 */
	@Override
	public double calNetSalary() {
		managerNetSalary = calGrossSalary() - (pt + 0.12 * super.getBasicSalary());
		return managerNetSalary;
		
	}

	/**
	 * toString() method to return the details of manager object
	 */
	@Override
	public String toString() {
		return super.toString() + "petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance
				+ ", otherAllowances=" + otherAllowances + ", managerGrossSalary=" + calGrossSalary()
				+ ", managerNetSalary=" + calNetSalary();
	}

}
