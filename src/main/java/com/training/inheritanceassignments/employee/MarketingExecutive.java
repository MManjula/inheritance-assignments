package com.training.inheritanceassignments.employee;

public class MarketingExecutive extends Employee {

	private double kilometersTravelled;
	private double tourAllowance;
	private static double telephoneAllowance = 1500;
	public static int pt = 200;
	private double marketingExecutiveGrossSalary;
	private double marketingExecutiveNetSalary;

	public MarketingExecutive() {
		// TODO Auto-generated constructor stub
	}

	public MarketingExecutive(int employeeId, String employeeName, double employeeBasicSalary, double medical,
			int kilometersTravelled) {
		super(employeeId, employeeName, employeeBasicSalary, medical);
		this.kilometersTravelled = kilometersTravelled;
		this.tourAllowance = 5 * kilometersTravelled;
	}

	@Override
	public double calGrossSalary() {
		this.marketingExecutiveGrossSalary = super.getBasicSalary() + super.getHra() + tourAllowance
				+ telephoneAllowance;
		return marketingExecutiveGrossSalary;
	}

	@Override
	public double calNetSalary() {
		this.marketingExecutiveNetSalary = calGrossSalary() - tourAllowance - telephoneAllowance - pt;
		return marketingExecutiveNetSalary;
	}

	@Override
	public String toString() {
		return super.toString() + "kilometersTravelled=" + kilometersTravelled + ", tourAllowance=" + tourAllowance
				+ ", marketingExecutiveGrossSalary=" + calGrossSalary() + ", marketingExecutiveNetSalary="
				+ calNetSalary();
	}

}
