package com.org.entity;

public class JavaWorkshop implements Workshop {
	
	private TrainingCompany company;
	
	public JavaWorkshop() {
		System.out.println("Default contructor of javaWorkshop");
	}
	
	public JavaWorkshop(TrainingCompany company) {
		super();
		this.company = company;
	}
	
	public TrainingCompany getCompany() {
		return company;
	}

	public void setCompany(TrainingCompany company) {
		this.company = company;
	}

	public void conductWorkshop() {
		System.out.println("Java workshop started!!!");
		company.conductTraining();
	}
	@Override
	public String toString() {
		return "JavaWorkshop [company=" + company + "]";
	}
}
