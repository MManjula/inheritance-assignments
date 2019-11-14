package com.training.inheritanceassignments.payrollsoftware;

/**
 * 
 * @author MManjula
 *
 */
public class PayrollSoftware {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private static double pt = 200;
	private double netSalary;
	private double grossSalary;

	public PayrollSoftware() {

	}

	/**
	 * 
	 * @param employeeId
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 */
	public PayrollSoftware(int employeeId, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = 0.5 * basicSalary;
		this.medical = medical;
		this.pf = 0.12 * basicSalary;
		this.grossSalary = basicSalary + hra + medical;
		this.netSalary = grossSalary - pf - pt;
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

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public static double getPt() {
		return pt;
	}

	public static void setPt(double pt) {
		PayrollSoftware.pt = pt;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary + ", hra="
				+ hra + ", medical=" + medical + ", pf=" + pf + ", netSalary=" + netSalary + ", grossSalary="
				+ grossSalary;
	}

}
