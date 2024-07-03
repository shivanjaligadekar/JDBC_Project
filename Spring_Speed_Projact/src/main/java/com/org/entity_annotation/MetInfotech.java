package com.org.entity_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetInfotech implements TrainingCompany{
	@Autowired
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
