package com.training.inheritanceassignments.training;

public class PublicTraining extends Training {
	private int participants;

	public PublicTraining() {
	}

	public PublicTraining(int id, String subject, double fees, int participants) {
		super(id, subject, fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	@Override
	public double getOrderValue() {
		return super.getFees() * participants;
	}

}
