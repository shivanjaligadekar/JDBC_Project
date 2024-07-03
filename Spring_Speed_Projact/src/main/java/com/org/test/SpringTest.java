package com.org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.entity.JavaWorkshop;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		JavaWorkshop advJavaWorkshop = context.getBean(JavaWorkshop.class);
		advJavaWorkshop.conductWorkshop();
	}

}
