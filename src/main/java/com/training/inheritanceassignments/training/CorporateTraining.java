package com.training.inheritanceassignments.training;

/**
 * 
 * @author MManjula
 *
 */
public class CorporateTraining extends Training {
	private int days;

	/**
	 * Default constructor
	 */
	public CorporateTraining() {

	}

	/**
	 * 
	 * @param id
	 * @param subject
	 * @param fees
	 * @param days
	 */
	public CorporateTraining(int id, String subject, double fees, int days) {
		super(id, subject, fees);
		this.days = days;
	}

	/**
	 * 
	 * setter and getter of days parameter
	 */
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	/**
	 * overriding getOrderValue method of Training class
	 */
	@Override
	public double getOrderValue() {
		return super.getFees() * days;
	}

}
