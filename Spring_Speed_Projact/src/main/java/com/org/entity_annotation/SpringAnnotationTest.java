package com.org.entity_annotation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		JavaTrainer javaTrainer= context.getBean(JavaTrainer.class);
		javaTrainer.setName("jeff");
		List<String> modules=new ArrayList<String>();
		modules.add("OPPs");
		modules.add("Exception handling");
		modules.add("Reflection");
		JavaWorkshop workshop= context.getBean(JavaWorkshop.class);
		workshop.conductWorkshop();
	}
}
