package com.training.inheritanceassignments.training;

/**
 * 
 * @author MManjula
 *
 */
public abstract class Training {
	private int id;
	private String subject;
	private double fees;

	/**
	 * Default constructor
	 */
	public Training() {
	}

	/**
	 * 
	 * @param id
	 * @param subject
	 * @param fees
	 */
	public Training(int id, String subject, double fees) {
		super();
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	/**
	 * 
	 * setters and getters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public abstract double getOrderValue();

	/**
	 * toString() method to print the details of TrainingF
	 */
	@Override
	public String toString() {
		return "id=" + id + ", subject=" + subject + ", fees=" + fees;
	}

}
