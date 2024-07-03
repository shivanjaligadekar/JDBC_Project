package com.org.entity;

public class MetInfotech implements TrainingCompany{

	private Trainer trainer;
	
	public MetInfotech() {
		System.out.println("Default constructor of MetInfotech.");
	}
	public MetInfotech(Trainer trainer) {
		super();
		this.trainer = trainer;
		System.out.println("Parameterised constructor of MetInfotech");
	}

	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
   public void conductTraining() {
		System.out.println("MetInfotech conduct Training");
		trainer.train();
		
	}
	@Override
	public String toString() {
		return "MetInfotech [trainer=" + trainer + "]";
	}

}
