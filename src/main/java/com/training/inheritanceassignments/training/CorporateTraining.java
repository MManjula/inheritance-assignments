package com.training.inheritanceassignments.training;

public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining() {

	}

	public CorporateTraining(int id, String subject, double fees, int days) {
		super(id, subject, fees);
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public double getOrderValue() {
		return super.getFees() * days;
	}

}
