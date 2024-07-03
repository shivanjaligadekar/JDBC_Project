package com.org.test;

import java.util.ArrayList;
import java.util.List;

import com.org.entity.JavaTrainer;
import com.org.entity.JavaWorkshop;
import com.org.entity.MetInfotech;
import com.org.entity.Trainer;
import com.org.entity.TrainingCompany;
import com.org.entity.Workshop;

public class NonSpringTest {
	public static void main(String[] args) {
		List<String> modules=new ArrayList<String>();
		modules.add("OOP");
		modules.add("Collection");
		modules.add("Treading");
		
		Trainer trainer=new JavaTrainer("jack",modules);
		TrainingCompany company=new MetInfotech(trainer);
		Workshop javaWorkshop=new JavaWorkshop(company);
		
		javaWorkshop.conductWorkshop();
		
	}

}
