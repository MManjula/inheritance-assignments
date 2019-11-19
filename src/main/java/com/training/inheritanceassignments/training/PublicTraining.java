package com.training.inheritanceassignments.training;
/**
 * 
 * @author MManjula
 *
 */
public class PublicTraining extends Training {
	private int participants;
/**
 * Default constructor
 */
	public PublicTraining() {
	}
/**
 * 
 * @param id
 * @param subject
 * @param fees
 * @param participants
 */
	public PublicTraining(int id, String subject, double fees, int participants) {
		super(id, subject, fees);
		this.participants = participants;
	}
/**
 * 
 * setter and getter of participants attribute
 */
	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
/**
 * overridding getOrderValue method
 */
	@Override
	public double getOrderValue() {
		return super.getFees() * participants;
	}

}
